import React from "react";
import homeStore from "../stores/homeStore";
import Header from "../components/Header";
import Footer from "../components/Footer";
import StickyBar from "../components/StickyBar";
import { Link } from "react-router-dom";
import "../scss/homeSheet.scss";

export default function Home() {
  const store = homeStore();

  // React.useEffect(() => {
  //   store.fetchHomeProducts();
  // }, []);

  return (
    <>
      <Header />
      <StickyBar/>
      <div className="app">
        <div className="home-page">
          <span>Sinbad</span>
          <div className="home-sales-container">
            <div className="saleBox1 home-sales-box home-box-style">Sale 1</div>
            <div className="saleBox2 home-sales-box home-box-style">Sale 2</div>
            <div className="saleBox3 home-sales-box home-box-style">Sale 3</div>
          </div>
          <div className="home-extra-container">
            <div className="home-extra home-box-style">extra 1</div>
            <div className="home-extra home-box-style">extra 2</div>
          </div>
          <span>Categories</span>
          <div className="home-categories-container">
            <Link to="/products" state={{ search: "Fruits" }}><div className="home-categories-box home-box-style">Fruits</div></Link>   
            <Link to="/products" state={{ search: "Vegetables" }}><div className="home-categories-box home-box-style">Vegetables</div></Link>   
            <Link to="/products" state={{ search: "Dairy" }}><div className="home-categories-box home-box-style">Dairy</div></Link>
            <Link to="/products" state={{ search: "Breakfast" }}><div className="home-categories-box home-box-style">Breakfast</div></Link>
            <Link to="/products" state={{ search: "Beverages" }}><div className="home-categories-box home-box-style">Beverages</div></Link>       
            <Link to="/products" state={{ search: "Pantry" }}><div className="home-categories-box home-box-style">Pantry</div></Link>   
            <Link to="/products" state={{ search: "Meat" }}><div className="home-categories-box home-box-style">Meat</div></Link>   
            <Link to="/products" state={{ search: "Seafood" }}><div className="home-categories-box home-box-style">Seafood</div></Link>   
            </div>
          </div>
        <Footer/>
      </div>
    </>
  );
}
