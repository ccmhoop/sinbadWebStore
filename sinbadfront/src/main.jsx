import React from "react";
import ReactDOM from "react-dom/client";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Home from "./pages/Home";
import Products from "./pages/Products";
import ShopCart from "./pages/ShopCart";
import CheckOut from "./pages/CheckOut";
import Account from "./pages/Account";
import "./scss/mainSheet.scss";
import ProductInfo from "./pages/ProductInfo";
import AddManager from "./pages/AddManager";
import Manager from "./pages/Manager";
import Register from "./pages/Register";

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <BrowserRouter>
    <Routes>
      <Route index element={<Home />} />
      <Route path="/products" element={<Products />} />
      <Route path="/shopcart" element={<ShopCart />} />
      <Route path="/checkout" element={<CheckOut />} />
      <Route path="/manager" element={<AddManager />} />
      <Route path="/register" element={<Register />} />
      <Route path="/man" element= {<Manager/>}/>
      <Route path="/login" element={<Account />} />
      <Route path="/productinfo" element={<ProductInfo />} />
    </Routes>
  </BrowserRouter>
);
