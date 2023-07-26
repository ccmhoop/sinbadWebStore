import React from "react";
import { FaShoppingBasket } from "react-icons/fa";
import { Link } from "react-router-dom";
import "../scss/headerSheet.scss";

export default function Header() {
  return (
    <header className="header">
      <div className="logo"></div>
      <Link to="/"><div className="title">Silk Road</div></Link> 
      <div className="shop-cart">
      </div>
    </header>
  );
}
