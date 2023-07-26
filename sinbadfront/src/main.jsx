import React from "react";
import ReactDOM from "react-dom/client";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Home from "./pages/Home";
import Products from "./pages/Products";
import ShopCart from "./pages/ShopCart";
import Register from "./pages/Register";
import CheckOut from "./pages/CheckOut";
import "./scss/mainSheet.scss";
import AddManager from "./pages/AddManager";
import Manager from "./pages/Manager";

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <BrowserRouter>
    <Routes>
      <Route index element={<Home />} />
      <Route path="/products" element={<Products />} />
      <Route path="/shopcart" element={<ShopCart />} />
      <Route path="/checkout" element={<CheckOut />} />
      <Route path="/add_manager" element={<AddManager />} />
      <Route path="/register" element={<Register />} />
      <Route path="/manager" element= {<Manager/>}/>
    </Routes>
  </BrowserRouter>
);
