import React from "react";
import Header from "../components/Header";
import Footer from "../components/Footer";
import StickyBar from "../components/StickyBar";
import { getCartItemsFromLocalStorage } from "../stores/shoppingCart";
import "../scss/shopcart-pageSheet.scss";
import ListShopCart from "../components/ListShopCart";

export default function shopcart() {

  const cartItems = getCartItemsFromLocalStorage();

  return (
    <>
      <Header />
      <StickyBar />
      <div className="app">
        <div className="shopcart-container">
          <h2>Shopping Cart</h2>
          {cartItems.length === 0 ? (<p>Your cart is empty.</p>) : (cartItems.map((item,index) => {
            return(<div className="shopCart-boxlist" key={index}><ListShopCart name={item.name} price={item.price} amount={item.quantity} /> </div>);               
          }))}
        </div>
        <Footer/>
      </div>
    </>
  );
}
