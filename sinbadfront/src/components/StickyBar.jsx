import React, { useState } from "react";
import "../scss/stickyBarSheet.scss";
import { useNavigate, Link } from "react-router-dom";
import { FaShoppingBasket } from "react-icons/fa";
import TotalPriceView from "../components/TotalPriceView";
import { userLogedIn, log } from "../stores/loginState";

export default function StickyBar() {
  const navigate = useNavigate();
  const [query, setQuery] = useState("");
  const updateQuery = (event) => setQuery(event.target.value);

  return (
    <>
      <div className="sticky-container">
        <Link to="/products" state={{ search: " " }}>
          <div className="sticky-products">Products</div>
        </Link>
        <input
          className="sticky-search"
          type="text"
          value={query}
          onChange={updateQuery}
          onKeyDown={(e) => {
            if (e.code === "Enter") {
              navigate("/products", { state: { search: query } });
            }
          }}
        />
        <div className="sticky-rightfr">
          <span className="sticky-login">
            {log() ? (
              <Link to="/man">Acount</Link>
            ) : (
              <Link to="/login">Login</Link>
            )}
          </span>
          <span className="sticky-register">
            {" "}
            {log() ? (
              <Link
                to="/"
                onClick={() => {
                  localStorage.clear("user_data");
                  window.location.reload(false);
                }}
              >
                Logout
              </Link>
            ) : (
              <Link to="/register">Register</Link>
            )}
          </span>
          <div className="sticky-pricebox">
            <div className="sticky-totalprice">
              <TotalPriceView />{" "}
              <div className="sticky-shopcart">
                <Link to="/shopcart">
                  <FaShoppingBasket color="gold" size="2em" />
                </Link>
              </div>
            </div>
          </div>
        </div>
      </div>
    </>
  );
}
