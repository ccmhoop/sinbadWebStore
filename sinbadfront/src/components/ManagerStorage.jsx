import React, { useState } from "react";
import axios, { Axios } from "axios";

export default function ManagerStorage({storageId,quantity,name,price,unitPrice,id}) {
  const [amount, setAmount] = useState(0);

  const handleSubmit = (e) => {
    e.preventDefault();
    axios
      .post(
        `http://localhost:8080/api/v1storage/${productId}/replace/${amount}`
      )
      .then((response) => {
        console.log("Manager data response", response.data);
      })
      .catch((error) => {
        console.error("order Failes:", error);
        return;
      });
  };

  return (
    <>
      <div>{name} </div>
      <span>cost: ${unitPrice}</span>
      <span>stock: {quantity}</span>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          pattern="[0-9]*"
          name="quantity"
          value={amount}
          onChange={(e) =>
            setAmount((v) => (e.target.validity.valid ? e.target.value : v))
          }
        />
        <button type="submit">Order</button>
      </form>
    </>
  );
}
