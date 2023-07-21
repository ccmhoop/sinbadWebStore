import React from "react";
import ReactDOM from "react-dom/client";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Home from "./pages/Home";
import "./scss/mainSheet.scss";
import Products from "./pages/Products";

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <BrowserRouter>
    <Routes>
      <Route index element={<Home />} />
      {/* <Route index element={<Products />} /> */}
      <Route path="/products" element={<Products/>} />
      {/* <Route path="/Shopcart" element={<ShopCart />} /> */}
    </Routes>
  </BrowserRouter>
);
