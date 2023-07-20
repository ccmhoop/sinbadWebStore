import React from "react";
import homeStore from "../stores/homeStore";
import ListItem from "../components/ListItem";
import Header from "../components/Header";
import HomeBody from "../components/HomeBody";
import Footer from "../components/Footer";
import StickyBar from "../components/StickyBar";


export default function Home() {
  const store = homeStore();

  React.useEffect(() => {
    store.fetchHomeProducts();
  }, []);

  return (
    <>
      <Header />
      <StickyBar/>
      <div className="app">
        <div className="home-page">
          <span>Sinbad</span>
          <div className="sales-container">
            <div className="saleBox1 sales-box box-style">Sale 1</div>
            <div className="saleBox2 sales-box box-style">Sale 2</div>
            <div className="saleBox3 sales-box box-style">Sale 3</div>
          </div>
          <div className="extra-container">
            <div className="extra box-style">extra 1</div>
            <div className="extra box-style">extra 2</div>
          </div>
          <span>Categories</span>
          <div className="categories-container">
            <div className="category1 categories-box box-style"></div>
            <div className="category2 categories-box box-style"></div>
            <div className="category3 categories-box box-style"></div>
            <div className="category4 categories-box box-style"></div>
            <div className="category5 categories-box box-style"></div>
            <div className="category6 categories-box box-style"></div>
          </div>
          <div className="product-flex">
            {store.products.map((product) => {
              return (
                <div key={product.id}>
                  {/* <HomeBody key={product.id} product={product} /> */}
                  {/* <ListItem key={product.id} product={product} /> */}
                </div>
              );
            })}
          </div>
        </div>
        <Footer />
      </div>
    </>
  );
}
