import React from "react";
import ReactDOM from "react-dom/client";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Home from "./pages/Home";
import "./scss/mainSheet.scss";

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <BrowserRouter>
    <Routes>
      <Route index element={<Home />} />
      {/* <Route path="/:id" element={<Show />} /> */}
      {/* <Route path="/Shopcart" element={<ShopCart />} /> */}
    </Routes>
  </BrowserRouter>
);
