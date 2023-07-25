import React from "react";
import Header from "../components/Header";
import Footer from "../components/Footer";
import StickyBar from "../components/StickyBar";
import productStore from "../stores/productStore";
import { Link } from "react-router-dom";
import "../scss/homeSheet.scss";

export default function ProductInfo() {
  const store = productStore();

  React.useEffect(() => {
    store.fetchProducts();
  }, []);

  return (
    <>
      <Header />
      <StickyBar />
      <div className="app">
        <div>
          {store.products.map((product) => {
            return (
              <div key={product.id}>
                <div>
                  <h1>{product.description}</h1>
                  <h2>{product.price}</h2>
                </div>
              </div>
            );
          })}
        </div>

        <Footer />
      </div>
    </>
  );
}
