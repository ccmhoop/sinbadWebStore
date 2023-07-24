import React from "react";
import ReactDOM from "react-dom/client";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Home from "./pages/Home";
import "./scss/mainSheet.scss";
import Register from "./pages/Register";
import Account from "./pages/Account"


const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <BrowserRouter>
    <Routes>
      <Route index element={<Home />} />
      {/* <Route path="/:id" element={<Show />} /> */}
      {/* <Route path="/Shopcart" element={<ShopCart />} /> */}
      <Route path="/register" element={<Register />} />
      <Route path="/account" element={<Account/>}/>
    </Routes>
  </BrowserRouter>
);
