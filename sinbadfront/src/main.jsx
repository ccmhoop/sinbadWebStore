import React from "react";
import ReactDOM from "react-dom/client";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Home from "./pages/Home";
import Products from "./pages/Products";
import ShopCart from "./pages/ShopCart";
import Register from "./pages/Register";
import CheckOut from "./pages/CheckOut";
import Account from "./pages/Account";
import "./scss/mainSheet.scss";
import AddManager from "./pages/AddManager";

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
      <Route path="/login" element={<Account />} />
    </Routes>
  </BrowserRouter>
);
