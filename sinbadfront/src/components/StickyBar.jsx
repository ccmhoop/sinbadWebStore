import React from 'react'
import "../scss/stickyBarSheet.scss";

export default function StickyBar() {
  return (
    <div className="sticky-container">
        <div className='stick-grid'>
            <div className='sticky-homelogo'></div>
            <input className="sticky-search" type="text" />
            <div className='sticky-shopcart'></div>
            </div>
        
    </div>
  )
}
