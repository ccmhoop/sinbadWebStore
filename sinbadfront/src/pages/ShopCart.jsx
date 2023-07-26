import React from "react";
import Header from "../components/Header";
import Footer from "../components/Footer";
import StickyBar from "../components/StickyBar";
import { getCartItemsFromLocalStorage, userCartdata,checkOutStorage } from "../stores/shoppingCart";
import "../scss/shopcart-pageSheet.scss";
import ListShopCart from "../components/ListShopCart";
import TotalPriceView from "../components/TotalPriceView";
import { Link } from "react-router-dom";

export default function shopcart() {
  const cartItems = getCartItemsFromLocalStorage();

  return (
    <>
      <Header />
      <StickyBar />
      <div className="app">
        <h1>
          Shopping Cart
          {cartItems.length === 0 ? <p>Your cart is empty.</p> : <></>}
        </h1>
        <div className="shopcart-container">
          <span className="shopcart-checkout-box">
            <TotalPriceView />
            <Link to="/shopcart">
              <div onClick={() => {
                userCartdata();
                checkOutStorage();

        }} className="shoptcart-checkout-accept">Check Out</div>
            </Link>
          </span>
          <div className="shopcart-item-grid-flex">
            {cartItems.map((item, index) => {
              return (
                <div className="shopCart-boxlist" key={index}>
                  <ListShopCart
                    id={item.productId}
                    name={item.name}
                    price={item.price}
                    quantity={item.quantity}
                  />{" "}
                </div>
              );
            })}
          </div>
        </div>
        <Footer />
      </div>
    </>
  );
}
