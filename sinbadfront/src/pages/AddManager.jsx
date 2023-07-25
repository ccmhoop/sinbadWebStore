import React, { useState } from "react";
import axios from "axios";

export default function AddManager() {

  const [user, setUser] = useState({
    customerName: "John", // Replace with a random name if desired
      customerSurname: "Doe", // Replace with a random surname if desired
      eMail: "john.doe@example.com", // Replace with a random email if desired
      address: "123 Main Street", // Replace with a random address if desired
      password: "randompassword123", // Replace with a random password if desired
      dateOfBirth: new Date(1990, 5, 15), // Replace with a random date if desired
      role: "MANAGER",
      phone: "065595959", // Replace with a random phone number if desired
  });

  const handleSubmit = (event) => {
    event.preventDefault();

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

    console.log(user);
  };

  return (
    <div>
      <h2>Add Manager</h2>
      <form onSubmit={handleSubmit}>
        <button type="submit">Add Manager</button>
      </form>
    </div>
  );
}
