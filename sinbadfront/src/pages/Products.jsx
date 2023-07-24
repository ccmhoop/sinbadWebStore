import React from "react";
import { useLocation } from "react-router-dom";
import productStore from "../stores/productStore";
import Header from "../components/Header";
import ListProduct from "../components/ListProduct";
import Footer from "../components/Footer";
import StickyBar from "../components/StickyBar";
import "../scss/products-pageSheet.scss";
import { Link } from "react-router-dom";

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
        <div className="products-category-tab">
            <Link to="/products" state={{ search: "Fruits" }}><div className="product-category">Fruits</div></Link>   
            <Link to="/products" state={{ search: "Vegetables" }}><div className="product-category">Vegetables</div></Link> 
            <Link to="/products" state={{ search: "Bakery" }}><div className="product-category">Bakery</div></Link>    
            <Link to="/products" state={{ search: "Snacks" }}><div className="product-category">Snacks</div></Link>  
            <Link to="/products" state={{ search: "Dairy" }}><div className="product-category">Dairy</div></Link>
            <Link to="/products" state={{ search: "Personal Care" }}><div className="product-category">Personal Care</div></Link>
            <Link to="/products" state={{ search: "Breakfast" }}><div className="product-category">Breakfast</div></Link>
            <Link to="/products" state={{ search: "Beverages" }}><div className="product-category">Beverages</div></Link>       
            <Link to="/products" state={{ search: "Pantry" }}><div className="product-category">Pantry</div></Link>   
            <Link to="/products" state={{ search: "Meat" }}><div className="product-category">Meat</div></Link>   
            <Link to="/products" state={{ search: "Seafood" }}><div className="product-category">Seafood</div></Link> 

        </div>
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

