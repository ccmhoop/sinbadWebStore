import React from "react";
import { Link } from "react-router-dom";
import "../scss/products-pageSheet.scss";
import { FaCartPlus } from "react-icons/fa";

export default function ListProduct({ product, category }) {
  // if(!product) return <></>
  if (product.category === category) {
    return (
      <>
        {" "}
        <div className="product-box-style">
        <span className="products-name">{product.name}</span>
          <div className="product-box-price">${product.price}</div>{" "}
        </div>
        <span className="products-cart-icon">
          <FaCartPlus size="1.5rem" />
        </span>
      </>

      // {/* <Link to={`/${product.id}`}>{product.name}</Link> */}
    );
  }
}
