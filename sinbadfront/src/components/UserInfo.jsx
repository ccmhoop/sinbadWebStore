import React from "react";
import "../scss/profilesheet.scss";

export default function UserInfo({
  eMail,
  address,
  phone,
  dateOfBirth,
  customerSurname,
  customerName,
  id,
}) {
  return (
    <div key={id} className="home-box-style">
      <p className="details"> <span>E-mail:</span> {eMail}</p>
      <p className="details"> <span>Adress:</span> {address}</p>
      <p className="details"> <span>Phone:</span> {phone}</p>
      <p className="details"> <span>Birth date:</span>  {dateOfBirth}</p>
      <p className="details"> <span>Name:</span> {customerName} {customerSurname} </p>
    </div>
  );
}
