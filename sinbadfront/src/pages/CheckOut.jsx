import React from "react";
import Header from "../components/Header";
import Footer from "../components/Footer";
import StickyBar from "../components/StickyBar";
import {getCartItemsFromLocalStorage} from "../stores/shoppingCart";
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
        
      
        
        
        <Footer />
        </div>
    </>
  );
}