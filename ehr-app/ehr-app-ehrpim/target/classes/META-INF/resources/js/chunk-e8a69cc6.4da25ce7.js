(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-e8a69cc6"],{4765:function(e,t,n){"use strict";n.d(t,"a",(function(){return i}));var a=n("d4ec"),r=n("bee2"),i=function(){function e(){var t=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};Object(a["a"])(this,e),this.$store=null,this.$store=t.$store}return Object(r["a"])(e,[{key:"getStore",value:function(){return this.$store}},{key:"getService",value:function(e){return window["uiServiceRegister"].getService(e)}}]),e}()},"90a8":function(e,t,n){"use strict";n.r(t);var a=n("d4ec"),r=n("99de"),i=n("7e84"),s=n("262e"),c=(n("99af"),n("4160"),n("4ec9"),n("d3b7"),n("3ca3"),n("159b"),n("ddb0"),n("96cf"),n("1da1")),o=n("bee2"),p=n("032b"),u=n("d257"),l=n("4765"),h=n("8858"),g=function(e){function t(){var e,n=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};return Object(a["a"])(this,t),e=Object(r["a"])(this,Object(i["a"])(t).call(this,n)),e.isEnableWorkflow=!1,e.dataService=new h["default"],e.allViewMap=new Map,e.stateValue=0,e.stateField="",e.mainStateFields=[],e.allDeMainStateMap=new Map,e.initViewMap(),e.initDeMainStateMap(),e}return Object(s["a"])(t,e),Object(o["a"])(t,[{key:"initViewMap",value:function(){this.allViewMap.set(":",{viewname:"editview2",srfappde:"pimpersonchanges"}),this.allViewMap.set("MDATAVIEW:",{viewname:"gridview",srfappde:"pimpersonchanges"}),this.allViewMap.set("EDITVIEW:",{viewname:"editview",srfappde:"pimpersonchanges"}),this.allViewMap.set(":",{viewname:"hisrecgridview",srfappde:"pimpersonchanges"}),this.allViewMap.set(":",{viewname:"reasoneditview",srfappde:"pimpersonchanges"}),this.allViewMap.set(":",{viewname:"pickupgridview",srfappde:"pimpersonchanges"}),this.allViewMap.set(":",{viewname:"readeditview",srfappde:"pimpersonchanges"}),this.allViewMap.set("PICKUPVIEW:",{viewname:"pickupview",srfappde:"pimpersonchanges"}),this.allViewMap.set("REDIRECTVIEW:",{viewname:"redirectview",srfappde:"pimpersonchanges"}),this.allViewMap.set("MPICKUPVIEW:",{viewname:"mpickupview",srfappde:"pimpersonchanges"})}},{key:"initDeMainStateMap",value:function(){}},{key:"PimPersonChange_HisRec",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(t){var n,a,r,i,s,c,o,p,l,h,g,m,d,f,v=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:n=v.length>1&&void 0!==v[1]?v[1]:{},a=v.length>2&&void 0!==v[2]?v[2]:{},v.length>3?v[3]:void 0,v.length>4?v[4]:void 0,r=v.length>5?v[5]:void 0,i=v.length>6?v[6]:void 0,s={},c={},o={},p=r,l=u["h"].deepCopy(t),h="NONE",p.context&&(c=p.context),p.viewparams&&(o=p.viewparams),n=u["g"].handleContextParam(h,l,c,o,n),s=u["g"].handleActionParam(h,l,c,o,a),n=Object.assign({},r.context,n),g={srfparentdename:i||null,srfparentkey:i?n[i.toLowerCase()]:null},Object.assign(s,g),Object.assign(n,g),m=[],n.pimperson&&(m=[{pathName:"pimpeople",parameterName:"pimperson"}]),d=[{pathName:"pimpersonchanges",parameterName:"pimpersonchange"},{pathName:"hisrecgridview",parameterName:"hisrecgridview"}],f=function(e){var t=r.$viewTool.buildUpRoutePath(r.$route,n,m,d,l,e);return r.$router.push(t),null},f(s);case 25:case"end":return e.stop()}}),e)})));function t(t){return e.apply(this,arguments)}return t}()},{key:"PimPersonChange_Refuse",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(t){var n,a,r,i,s,c,o,p,l,h,g,m,d,f,v,w=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:n=w.length>1&&void 0!==w[1]?w[1]:{},a=w.length>2&&void 0!==w[2]?w[2]:{},w.length>3?w[3]:void 0,r=w.length>4?w[4]:void 0,i=w.length>5?w[5]:void 0,s=w.length>6?w[6]:void 0,c={},o={},p={},l=i,h=u["h"].deepCopy(t),g="SINGLEKEY",Object.assign(n,{pimpersonchange:"%pimpersonchange%"}),Object.assign(a,{pimpersonchangeid:"%pimpersonchange%"}),Object.assign(a,{pimpersonchangename:"%pimpersonchangename%"}),l.context&&(o=l.context),l.viewparams&&(p=l.viewparams),n=u["g"].handleContextParam(g,h,o,p,n),c=u["g"].handleActionParam(g,h,o,p,a),n=Object.assign({},i.context,n),m={srfparentdename:s||null,srfparentkey:s?n[s.toLowerCase()]:null},Object.assign(c,m),Object.assign(n,m),d=[],n.pimperson&&(d=[{pathName:"pimpeople",parameterName:"pimperson"}]),f=[{pathName:"pimpersonchanges",parameterName:"pimpersonchange"},{pathName:"reasoneditview",parameterName:"reasoneditview"}],v=function(e){var a=i.$viewTool.buildUpRoutePath(i.$route,n,d,f,h,e);return i.$router.push(a),r&&r.refresh&&r.refresh instanceof Function&&r.refresh(t),null},v(c);case 28:case"end":return e.stop()}}),e)})));function t(t){return e.apply(this,arguments)}return t}()},{key:"PimPersonChange_Ensure",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(t){var n,a,r,i,s,c,o,p,l,g,m,d,f,v=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:n=v.length>1&&void 0!==v[1]?v[1]:{},a=v.length>2&&void 0!==v[2]?v[2]:{},v.length>3?v[3]:void 0,r=v.length>4?v[4]:void 0,i=v.length>5?v[5]:void 0,s=v.length>6?v[6]:void 0,c={},o={},p={},l=i,g=u["h"].deepCopy(t),m="SINGLEKEY",Object.assign(n,{pimpersonchange:"%pimpersonchange%"}),Object.assign(a,{pimpersonchangeid:"%pimpersonchange%"}),Object.assign(a,{pimpersonchangename:"%pimpersonchangename%"}),l.context&&(o=l.context),l.viewparams&&(p=l.viewparams),n=u["g"].handleContextParam(m,g,o,p,n),c=u["g"].handleActionParam(m,g,o,p,a),n=Object.assign({},i.context,n),d={srfparentdename:s||null,srfparentkey:s?n[s.toLowerCase()]:null},Object.assign(c,d),Object.assign(n,d),n&&n.srfsessionid&&(n.srfsessionkey=n.srfsessionid,delete n.srfsessionid),i.closeView(null),f=function(){var e=new h["default"];e.Ensure(n,c,!0).then((function(e){if(e&&200===e.status){i.$Notice.success({title:"成功",desc:"确认成功！"});return r&&r.refresh&&r.refresh instanceof Function&&r.refresh(t),e}i.$Notice.error({title:"错误",desc:e.message})}))["catch"]((function(e){if(e&&e.status&&e.data){if(401!==e.status)return e}else i.$Notice.error({title:"错误",desc:"系统异常！"})}))},f();case 27:case"end":return e.stop()}}),e)})));function t(t){return e.apply(this,arguments)}return t}()},{key:"PimPersonChange_QR",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(t){var n,a,r,i,s,c,o,p,l,g,m,d,f,v=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:n=v.length>1&&void 0!==v[1]?v[1]:{},a=v.length>2&&void 0!==v[2]?v[2]:{},v.length>3?v[3]:void 0,r=v.length>4?v[4]:void 0,i=v.length>5?v[5]:void 0,s=v.length>6?v[6]:void 0,c={},o={},p={},l=i,g=u["h"].deepCopy(t),m="MULTIKEY",Object.assign(n,{pimpersonchange:"%pimpersonchange%"}),Object.assign(a,{pimpersonchangeid:"%pimpersonchange%"}),Object.assign(a,{pimpersonchangename:"%pimpersonchangename%"}),l.context&&(o=l.context),l.viewparams&&(p=l.viewparams),n=u["g"].handleContextParam(m,g,o,p,n),c=u["g"].handleActionParam(m,g,o,p,a),n=Object.assign({},i.context,n),d={srfparentdename:s||null,srfparentkey:s?n[s.toLowerCase()]:null},Object.assign(c,d),Object.assign(n,d),n&&n.srfsessionid&&(n.srfsessionkey=n.srfsessionid,delete n.srfsessionid),i.closeView(null),f=function(){var e=new h["default"];e.QR(n,c,!0).then((function(e){if(e&&200===e.status){i.$Notice.success({title:"成功",desc:"同意成功！"});return r&&r.refresh&&r.refresh instanceof Function&&r.refresh(t),e}i.$Notice.error({title:"错误",desc:e.message})}))["catch"]((function(e){if(e&&e.status&&e.data){if(401!==e.status)return e}else i.$Notice.error({title:"错误",desc:"系统异常！"})}))},f();case 27:case"end":return e.stop()}}),e)})));function t(t){return e.apply(this,arguments)}return t}()},{key:"PimPersonChange_BH",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(t){var n,a,r,i,s,c,o,p,l,h,g,m,d,f,v,w=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:n=w.length>1&&void 0!==w[1]?w[1]:{},a=w.length>2&&void 0!==w[2]?w[2]:{},w.length>3?w[3]:void 0,r=w.length>4?w[4]:void 0,i=w.length>5?w[5]:void 0,s=w.length>6?w[6]:void 0,c={},o={},p={},l=i,h=u["h"].deepCopy(t),g="SINGLEKEY",Object.assign(n,{pimpersonchange:"%pimpersonchange%"}),Object.assign(a,{pimpersonchangeid:"%pimpersonchange%"}),Object.assign(a,{pimpersonchangename:"%pimpersonchangename%"}),l.context&&(o=l.context),l.viewparams&&(p=l.viewparams),n=u["g"].handleContextParam(g,h,o,p,n),c=u["g"].handleActionParam(g,h,o,p,a),n=Object.assign({},i.context,n),m={srfparentdename:s||null,srfparentkey:s?n[s.toLowerCase()]:null},Object.assign(c,m),Object.assign(n,m),d=[],n.pimperson&&(d=[{pathName:"pimpeople",parameterName:"pimperson"}]),f=[{pathName:"pimpersonchanges",parameterName:"pimpersonchange"},{pathName:"reasoneditview",parameterName:"reasoneditview"}],i.closeView(null),v=function(e){var a=i.$viewTool.buildUpRoutePath(i.$route,n,d,f,h,e);return i.$router.push(a),r&&r.refresh&&r.refresh instanceof Function&&r.refresh(t),null},v(c);case 29:case"end":return e.stop()}}),e)})));function t(t){return e.apply(this,arguments)}return t}()},{key:"getRDAppView",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(t,n){var a,r,i,s,c;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return this.isEnableWorkflow=n,e.next=3,this.dataService.Get({pimpersonchange:t});case 3:if(a=e.sent,r=a.data,!0,i=!1,s=!1,!this.isEnableWorkflow){e.next=17;break}return e.next=11,this.dataService.testDataInWF({stateValue:this.stateValue,stateField:this.stateField},r);case 11:if(i=e.sent,!i){e.next=17;break}return i=!0,e.next=16,this.dataService.testUserExistWorklist(null,r);case 16:s=e.sent;case 17:return e.next=19,this.getDESDDEViewPDTParam(r,i,s);case 19:return c=e.sent,e.abrupt("return",this.allViewMap.get(c));case 21:case"end":return e.stop()}}),e,this)})));function t(t,n){return e.apply(this,arguments)}return t}()},{key:"getRealDEType",value:function(e){}},{key:"getDESDDEViewPDTParam",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(t,n,a){var r,i,s;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if("",r=!1,i=null,!r||!i){e.next=9;break}if(s=t[i],p["a"].isAppMode){e.next=8;break}return e.abrupt("return","MOBEDITVIEW"+s);case 8:return e.abrupt("return","EDITVIEW"+s);case 9:if(p["a"].isAppMode){e.next=17;break}if(!this.getDEMainStateTag(t)){e.next=16;break}return e.t0="MOBEDITVIEW:MSTAG:",e.next=14,this.getDEMainStateTag(t);case 14:return e.t1=e.sent,e.abrupt("return",e.t0.concat.call(e.t0,e.t1));case 16:return e.abrupt("return","MOBEDITVIEW:");case 17:if(!this.getDEMainStateTag(t)){e.next=23;break}return e.t2="EDITVIEW:MSTAG:",e.next=21,this.getDEMainStateTag(t);case 21:return e.t3=e.sent,e.abrupt("return",e.t2.concat.call(e.t2,e.t3));case 23:return e.abrupt("return","EDITVIEW:");case 24:case"end":return e.stop()}}),e,this)})));function t(t,n,a){return e.apply(this,arguments)}return t}()},{key:"getDEMainStateTag",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(t){var n,a,r,i,s,c;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(0!==this.mainStateFields.length){e.next=2;break}return e.abrupt("return",null);case 2:this.mainStateFields.forEach((function(e){e in t||console.error("当前数据对象不包含属性singleMainField，可能会发生错误")})),"",n=0;case 5:if(!(n<=1)){e.next=31;break}if(a=t[this.mainStateFields[0]]&&0==n?t[this.mainStateFields[0]]:"",!(this.mainStateFields.length>=2)){e.next=27;break}r=0;case 9:if(!(r<=1)){e.next=25;break}if(i=t[this.mainStateFields[1]]?"".concat(a,"__").concat(0==r?t[this.mainStateFields[1]]:""):a,!(this.mainStateFields.length>=3)){e.next=21;break}s=0;case 13:if(!(s<=1)){e.next=19;break}return c=t[this.mainStateFields[2]]?"".concat(i,"__").concat(0==s?t[this.mainStateFields[2]]:""):i,e.abrupt("return",this.allDeMainStateMap.get(c));case 16:s++,e.next=13;break;case 19:e.next=22;break;case 21:return e.abrupt("return",this.allDeMainStateMap.get(i));case 22:r++,e.next=9;break;case 25:e.next=28;break;case 27:return e.abrupt("return",this.allDeMainStateMap.get(a));case 28:n++,e.next=5;break;case 31:return e.abrupt("return",null);case 32:case"end":return e.stop()}}),e,this)})));function t(t){return e.apply(this,arguments)}return t}()}]),t}(l["a"]);n.d(t,"default",(function(){return m}));var m=function(e){function t(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};return Object(a["a"])(this,t),Object(r["a"])(this,Object(i["a"])(t).call(this,e))}return Object(s["a"])(t,e),t}(g)}}]);