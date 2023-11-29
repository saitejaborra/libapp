import React from "react";
import './stylesheets/header.css';
import { NavLink } from "react-router-dom";

function Header()  {
    return(
        <div className="menu-bar">
            <img src="../wsu-logo.svg" alt="wsu-logo"></img>
            <ul>
                <li>
                    <NavLink to="/">Home</NavLink>
                    </li>
                <li>
                    <NavLink to="/members">Members</NavLink>
                    </li>
                <li> <NavLink to= "/inventory">Inventory</NavLink></li>
            </ul>
        </div>
    );

}
export default Header;