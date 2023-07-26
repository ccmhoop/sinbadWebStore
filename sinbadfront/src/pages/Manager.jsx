import React,{useState} from "react";
import Header from "../components/Header";
import Footer from "../components/Footer";
import StickyBar from "../components/StickyBar";
import ManagerStorage from "../components/ManagerStorage";
import managerStore from "../stores/managerStore";
import "../scss/manager-pageSheet.scss";

import { Link } from "react-router-dom";

export default function Manager() {
  const managerStorage = managerStore();
  const [query, setQuery] = useState("");
  const updateQuery = (event) => setQuery(event.target.value);

  React.useEffect(() => {
    managerStorage.fetchStorage();
  }, []);

  console.log(managerStorage);
  return (
    <>
      <Header />
      <StickyBar />
      <div className="app">       
      <input
          className="sticky-search manager-search"
          type="text"
          value={query}
          onChange={updateQuery}
        />
          
        <div className="manager-page">
 
        <div>
          {managerStorage.storage.map((storage) => {
            if(storage.name.toLowerCase().includes(query.toLowerCase())){
            return (<>
            <div className="manager-product-row">
              <div className="manager-product-box" key={storage.id}>
                <ManagerStorage
                  storageId={storage.storageId}
                  id = {storage.id}
                  quantity={storage.amount}
                  unitPrice={storage.unitPrice}
                  price={storage.price}
                  name={storage.name}
                />
              </div>
              <button className="manager-remove"></button>
              <button className="manager-remove">Remove</button>
              </div>
              
              </>
            );
          }})}
        </div>
    </div>
        <Footer />
      </div>
    </>
  );
}
