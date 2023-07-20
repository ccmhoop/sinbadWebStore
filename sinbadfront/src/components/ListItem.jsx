import React from "react";
import { Link } from "react-router-dom";

export default function ListItem({ product }) {
  // if(!product) return <></>
  return (
    <>
      <div>{product.name}</div>
      {/* <Link to={`/${product.id}`}>{product.name}</Link> */}
    </>
  );
}
