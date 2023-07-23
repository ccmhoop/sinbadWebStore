import React from "react";
import { viewPrice } from "../stores/shoppingCart";


export default function TotalPriceView(){

  const total = viewPrice(state => state.total)


    return (
        <span className="total-price">
          ${total.toFixed(2)}
        </span>
      );
};