import React, { useState } from "react";
import "../scss/stickyBarSheet.scss";
import { useNavigate,Link } from "react-router-dom";
import { FaShoppingBasket } from "react-icons/fa";
import TotalPriceView from "../components/TotalPriceView";

export default function StickyBar() {
  
  const navigate = useNavigate();
  const [query, setQuery] = useState("");
  const updateQuery = (event) => setQuery(event.target.value);

  return (
  <> 
    <div className="sticky-container">
      <input className="sticky-search" type="text" value={query} onChange={updateQuery} onKeyDown={(e)=>{if(e.code==="Enter"){
        navigate("/products",{state:{search: query }});
      }}}/> 
      <div className="sticky-pricebox">
        <div className="sticky-totalprice">
          <TotalPriceView/> 
        </div>
      </div>
      <div className="sticky-shopcart"><Link to="/shopcart" state ={{ search: "" }}><FaShoppingBasket color="gold"size="2em"/></Link></div>

      
      
    </div>
    
  </>
 
  );
}
