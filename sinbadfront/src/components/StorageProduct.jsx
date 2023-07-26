import React from "react";

export default function StorageProduct(storage) {
  return (
    <>
      <div>{storage.productType}</div>
      <div>{storage.storage}</div>
    </>
  );
}
