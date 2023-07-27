import React from "react";
import StickyBar from "../components/StickyBar";
import Header from "../components/Header";
import Footer from "../components/Footer";
import { localUserData, userData } from "../stores/loginState";
import { useState } from "react";
import axios from "axios";
import UserInfo from "../components/UserInfo";


export default function Profile() {
  return (
    <div>
      <Header />
      <StickyBar />
      <div className="app">
        {userData.map((info) => (
          <UserInfo
            id={info.id}
            eMail={info.eMail}
            address={info.address}
            phone={info.phone}
            dateOfBirth={info.dateOfBirth}
            customerName={info.customerName}
            customerSurname={info.customerSurname}
          />
        ))}
        <Footer />
      </div>
    </div>
  );
}
