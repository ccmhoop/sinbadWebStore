import React from "react";
import "../scss/footerSheet.scss";

export default function Footer() {
  let date = new Date().getFullYear();

  return (
    <div className="footer-flex footer-details">
      <div class="links">
        <div><a href="faq">FAQ</a></div>
        <div><a href="about">About</a></div>
        <div><a href="team">Team</a></div>
        <div><a href="customer-service">Customer service</a></div>
      </div>
      <div>©{date} Silk Road</div>
    </div>
  );
};