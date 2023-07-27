import React from "react";
import "../scss/profilesheet.scss";
import { useState } from "react";

export default function UserInfo({
  eMail : initialEmail,
  address : initialAddress,
  phone : initialPhone,
  dateOfBirth,
  customerSurname,
  customerName,
  id,
  ChangeInfo,
}) {

    const [changeeMail, setEmail] = useState(initialEmail);
    const [changeAddress, setAddress] = useState(initialAddress);
    const [changePhone, setPhone] = useState(initialPhone);

    const handleEmailChange = (e) => {
        setEmail(e.target.value);
      };
    
      const handleAddressChange = (e) => {
        setAddress(e.target.value);
      };
    
      const handlePhoneChange = (e) => {
        setPhone(e.target.value);
      };
    
      const handleEmailUpdate = () => {
        ChangeInfo("eMail", email);
      };
    
      const handleAddressUpdate = () => {
        ChangeInfo("address", address);
      };
    
      const handlePhoneUpdate = () => {
        ChangeInfo("phone", phone);
      };

  return (
    <div key={id} className="home-box-style"> 
      <p className="details">
         <span>Name:</span> {customerName} {customerSurname} 
         </p>
      <p className="details"> 
        <span>Birth date:</span>  {dateOfBirth} 
        </p>
      <p className="details"> 
        <span>E-mail:</span> {initialEmail} 
        <input type="text" 
            value={changeeMail}
            placeholder="info"
            onChange={handleEmailChange}
        />
        <span className="info-button"></span>
        <button onClick={handleEmailUpdate}> change email </button>
        </p>
      <p className="details"> 
        <span>Adress:</span> {initialAddress}
        <input type="text" 
            value={changeAddress}
            placeholder="info"
            onChange={handleAddressChange}
        /> 
        <span className="info-button"></span>
        <button onClick={handleAddressUpdate}>change address</button>
        </p>
      <p className="details"> 
        <span>Phone:</span> {initialPhone} 
        <input type="text" 
            value={changePhone}
            placeholder="info"
            onChange={handlePhoneChange}
        />
        <span className="info-button"></span>
        <button onClick={handlePhoneUpdate}>change phone</button>
        </p>
    </div>
  );
}
