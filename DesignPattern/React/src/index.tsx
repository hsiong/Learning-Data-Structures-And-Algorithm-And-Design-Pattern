import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import Hello from './components/Hello';

const root = ReactDOM.createRoot(
  // 类型断言  当你比类型检查器更清楚一个表达式的类型的时候，你可以通过这种方式通知TypeScript。
  document.getElementById('root') as HTMLElement
);
root.render(
  <Hello name="ts" level={10}/>
/*   <React.StrictMode>
    <App />
  </React.StrictMode> */
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();






