import React from "react";
import "../scss/shopcart-pageSheet.scss";

export default function ListShopCart({ name, price, amount }) {
  return (
    <>
      <div className="shopcart-item-bar">
        <span className="shopcart-product-name">{name}</span>
        <span className="shopcart-item-price"> ${price.toFixed(2)}</span>
      </div>
      <button className="shopcart-min-item">-</button>
      <span className="shopcart-item-quantity">{amount}</span>
      <button className="shopcart-plus-item">+</button>
    </>
  );
}
