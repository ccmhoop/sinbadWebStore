import React from "react";
import Header from "../components/Header";
import Footer from "../components/Footer";
import StickyBar from "../components/StickyBar";
import managerStore from "../stores/managerStore";
import "../scss/shopcart-pageSheet.scss";
import ListShopCart from "../components/ListShopCart";
import TotalPriceView from "../components/TotalPriceView";
import { Link } from "react-router-dom";

export default function Manager() {

  const managerStorage = managerStore();
 

  React.useEffect(() => {
    managerStorage.fetchStorage();
  }, []);

  console.log(managerStorage)
  return (
    <>
      <Header />
      <StickyBar />
      <div className="app">
        
        <div>{managerStorage.storage.map((product) => {
          
              // if(test.findIndex((item)=> item.id === product.id) >= 1){
              //   return;
              // }
              // test.push(product);
              // console.log(test)
              return (   
                <div key={product.id}>
                  {product.name}
                  {/* <ListProduct product={product} search={search} /> */}
                </div>
              );
            })} *

       </div>
      
        yoyoyoyoyo
        
        <Footer />
        </div>
    </>
  );
}