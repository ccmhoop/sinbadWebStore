import React, { useState } from "react";
import axios from "axios";
import Header from "../components/Header";
import Footer from "../components/Footer";
import StickyBar from "../components/StickyBar";
import { useNavigate} from "react-router-dom";
import { userRole,localUserData } from "../stores/loginState";

export default function Login() {


  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const updateEmail = (event) => setEmail(event.target.value);
  const updatePassword = (event) => setPassword(event.target.value);

  const [error, setError] = useState("");
  
  const role = userRole((state) => state.roleUser);

  const navigate = useNavigate();

  const handleLogin = (e) => {
    e.preventDefault();
      const loginData = {
        email: email,
        password: password,
      };
      axios.post("http://localhost:8080/api/v1/login", loginData)
        .then((response) => {
          let userData=[];
          for(let key in response.data){
            userData.push(response.data[key])
          }
          localUserData(
            userData[0],
            userData[1],
            userData[2],
            userData[3],
            userData[5],
            userData[6],
            userData[8],
            userData[10],
          );
          console.log(userData[4])
          if(userData[4]==="MANAGER"){
            navigate("/man");
            role(true);
            console.log("man")
          }else{
            navigate("/");
            role(false);
          }
        })
        .catch((error) => {
          localStorage.removeItem('user_data');
          setError("Invalid email or password. Please try again.");
          console.log(error);
        });
}

  return (
    <>
      <Header />
      <StickyBar />
      <div className="app">
        <h2>Login</h2>
        <form onSubmit={handleLogin}>
          <div>
            <label>Email:</label>
            <input type="email" value={email} onChange={updateEmail} required />
          </div>
          <div>
            <label>Password:</label>
            <input
              type="password"
              value={password}
              onChange={updatePassword}
              required
            />
          </div>
          {error && <div>{error}</div>}
          <button type="submit">Login</button>
        </form>

        <Footer />
      </div>
    </>
  );

}

