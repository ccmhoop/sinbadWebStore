import React, { useState } from "react";
import "../scss/stickyBarSheet.scss";
import { useNavigate,Link } from "react-router-dom";
import { FaShoppingBasket } from "react-icons/fa";

export default function StickyBar() {
  
  const navigate = useNavigate();
  const [query, setQuery] = useState("");
  const updateQuery = (event) => setQuery(event.target.value);

  return (
    <div className="sticky-container">
      <input className="sticky-search" type="text" value={query} onChange={updateQuery} onKeyDown={(e)=>{if(e.code==="Enter"){
        navigate("/products",{state:{search: query }});
      }}}/>

      {/* <Link to="/products" state ={{ search: "" }}><FaShoppingBasket /></Link>  */}
    </div>
  );
}
