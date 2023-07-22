import React from "react";
import { useLocation } from "react-router-dom";
import productStore from "../stores/productStore";
import Header from "../components/Header";
import ListProduct from "../components/ListProduct";
import Footer from "../components/Footer";
import StickyBar from "../components/StickyBar";
import "../scss/products-pageSheet.scss";

export default function Products() {

  const location = useLocation();
  const search = location.state?.search;

  const store = productStore();


  React.useEffect(() => {
    store.fetchProducts();
  }, []);

  return (
    <>
      <Header />
      <StickyBar/>
      <div className="app">
      <span>Products</span>
        <div className="products-page">
        <div className="products-category-tab">aaa</div>
          <div className="products-flex">
            {store.products.map((product) => {
              return (   
                <div key={product.id}>
                  <ListProduct product={product} search={search} />
                </div>
              );
            })}
          </div>
        </div>
        <Footer/>
      </div>
    </>
  );
}

