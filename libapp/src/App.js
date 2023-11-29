import React, { Fragment } from 'react';
import './stylesheets/index.css';
import Header from './Header';
import Inventory from './Inventory';
import TitleContainer from './TitleContainer';
import { Routes, Route } from 'react-router-dom';
import Members from './Members';

function App () {
    return(
        <Fragment>
    <Header />
    <Routes>
        <Route path="/" element={<TitleContainer />} />
        <Route path="/inventory" element = {<Inventory />} />
        <Route path="/members" element = {<Members />} />
    </Routes>
    </Fragment>
);
}
export default App;
