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
  ChangeInfo,
}) {

const handleChange = (e) => {
    e.target.value;
}


  return (
    <div key={id} className="home-box-style"> 
      <p className="details">
         <span>Name:</span> {customerName} {customerSurname} 
         </p>
      <p className="details"> 
        <span>Birth date:</span>  {dateOfBirth} 
        </p>
      <p className="details"> 
        <span>E-mail:</span> {eMail} 
        <input type="text" 
            value={eMail}
            onChange={handleChange}
        />
        <span className="info-button"></span>
        <button>change email </button>
        </p>
      <p className="details"> 
        <span>Adress:</span> {address}
        <input type="text" /> 
        <span className="info-button"></span>
        <button>change address</button>
        </p>
      <p className="details"> 
        <span>Phone:</span> {phone} 
        <input type="text" />
        <span className="info-button"></span>
        <button>change phone</button>
        </p>
    </div>
  );
}
