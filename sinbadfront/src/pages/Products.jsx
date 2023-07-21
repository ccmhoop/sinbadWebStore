import React from "react";
import { useParams,useLocation } from "react-router-dom";
import homeStore from "../stores/homeStore";
import Header from "../components/Header";
import ListProduct from "../components/ListProduct";
import Footer from "../components/Footer";
import StickyBar from "../components/StickyBar";
import "../scss/products-pageSheet.scss";



export default function Products() {

  const location = useLocation();
  const category = location.state?.category;

  const store = homeStore();


  React.useEffect(() => {
    store.fetchHomeProducts();
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
                  <ListProduct key={product.id} product={product} category={category} />
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

