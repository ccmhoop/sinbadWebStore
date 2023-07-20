import React from "react";
import { FaShoppingBasket } from "react-icons/fa";
import "./header.scss";

export default function Header() {
  return (
    <header className="header">
      <div className="logo">Logo</div>
      <div className="title">title</div>
      <div className="shop-cart">
        <FaShoppingBasket />
      </div>
    </header>
  );
}
