import React, { useState } from "react";
import "../scss/shopcart-pageSheet.scss";
import { addToCart, removeFromCart,viewPrice } from "../stores/shoppingCart";


export default function ListShopCart({ id, name, price, quantity }) {
  const [itemQuantity, setItemQuantity] = useState(quantity);
  const raiseTotal = viewPrice((state) => state.raiseTotal);
  const lowerTotal = viewPrice((state) => state.lowerTotal);

  const addItem = (id, name, price) => {
    addToCart(id, name, price, price);
    setItemQuantity(itemQuantity + 1);
    raiseTotal(price);
  };

  const removeItem = (id, price) => {
    removeFromCart(id);
    if (itemQuantity > 0) {
      setItemQuantity(itemQuantity - 1);
      lowerTotal(price);
    }
  };

  const displayPrice = (price * itemQuantity).toFixed(2);

  return (
    <>
      <div className="shopcart-item-bar">
        <span className="shopcart-product-name">{name}</span>
        <span className="shopcart-item-price"> ${displayPrice}</span>
      </div>
      <button
        className="shopcart-min-item"
        onClick={() => {
          removeItem(id, price);
        }}
      >
        -
      </button>
      <span className="shopcart-item-quantity">{itemQuantity}</span>
      <button
        className="shopcart-plus-item"
        onClick={() => {
          addItem(id, name, price);
        }}
      >
        +
      </button>
    </>
  );
}
