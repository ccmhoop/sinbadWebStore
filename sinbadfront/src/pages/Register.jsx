import React, { useState } from "react";
import axios from "axios";
import Header from "../components/Header";
import Footer from "../components/Footer";
import StickyBar from "../components/StickyBar";
import "../scss/register-pageSheet.scss";

export default function Register() {
  const [user, setUser] = useState({
    customerName: "",
    customerSurname: "",
    eMail: "",
    address: "",
    password: "",
    dateOfBirth: new Date(),
    role: "CUSTOMER",
    phone: 0,
  });

  const handleChange = (e) => {
    const { name, value } = e.target;

    const newValue = name === "date" ? new Date(value) : value;
    console.log(newValue);

    setUser((prevUser) => ({
      ...prevUser,
      [name]: newValue,
    }));
  };

  const formatDateToString = (dateOfBirth) => {
    const year = dateOfBirth.getFullYear();
    const month = String(dateOfBirth.getMonth() + 1).padStart(2, "0");
    const day = String(dateOfBirth.getDate()).padStart(2, "0");
    return `${year}-${month}-${day}`;
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    axios
      .post("http://localhost:8080/api/v1/register", user)
      .then((response) => {
        console.log(
          "Data has been sent and customer is registered:",
          response.data
        );
      })
      .catch((error) => {
        console.error("Error registering customer:", error);
      });
  };

  return (
    <div>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          name="customerName"
          value={user.customerName}
          onChange={handleChange}
          placeholder="Customer Name"
        />
        <input
          type="text"
          name="customerSurname"
          value={user.customerSurname}
          onChange={handleChange}
          placeholder="Customer Surname"
        />
        <input
          type="eMail"
          name="eMail"
          value={user.eMail}
          onChange={handleChange}
          placeholder="E-mail"
        />
        <input
          type="text"
          name="address"
          value={user.address}
          onChange={handleChange}
          placeholder="Address"
        />
        <input
          type="date"
          name="dateOfBirth"
          value={formatDateToString(user.dateOfBirth)}
          onChange={handleChange}
        />
        <input
          type="text"
          name="phone"
          value={user.phone}
          onChange={handleChange}
          placeholder="Phone"
        />

        <input
          type="password"
          name="password"
          value={user.password}
          onChange={handleChange}
          placeholder="password"
        />

        <button type="submit">Submit</button>
      </form>
    </div>
  );
}
