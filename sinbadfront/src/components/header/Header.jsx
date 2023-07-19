import React from "react";
import "./header.scss";

export default function Header() {
  return (
    <header className="header">
      <div className="logo">Logo</div>
      <div className="search-bar">
        <input type="text" placeholder="Please search" />
      </div>
      <div className="shop-cart">Shop cart</div>
    </header>
  );
}
