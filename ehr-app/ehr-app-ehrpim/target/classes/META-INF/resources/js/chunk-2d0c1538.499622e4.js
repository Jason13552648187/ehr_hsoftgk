(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-2d0c1538"],{4622:function(e,t,r){"use strict";r.r(t);var n=r("d4ec"),a=r("99de"),p=r("7e84"),i=r("262e"),c=(r("99af"),r("96cf"),r("1da1")),u=r("bee2"),s=r("d257"),o=r("ce95"),m=function(e){function t(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};return Object(n["a"])(this,t),Object(a["a"])(this,Object(p["a"])(t).call(this,e))}return Object(i["a"])(t,e),Object(u["a"])(t,[{key:"initBasicData",value:function(){this.APPLYDEKEY="pimpaper",this.APPDEKEY="pimpaperid",this.APPDENAME="pimpapers",this.APPDETEXT="pimpapername",this.APPNAME="ehrpim",this.SYSTEMNAME="ehr"}},{key:"Select",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(){var t,r,n=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(t=n.length>0&&void 0!==n[0]?n[0]:{},n.length>1&&void 0!==n[1]?n[1]:{},r=n.length>2?n[2]:void 0,!t.pimperson||!t.pimpaper){e.next=5;break}return e.abrupt("return",s["c"].getInstance().get("/pimpeople/".concat(t.pimperson,"/pimpapers/").concat(t.pimpaper,"/select"),r));case 5:return e.abrupt("return",s["c"].getInstance().get("/pimpapers/".concat(t.pimpaper,"/select"),r));case 6:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()},{key:"Update",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(){var t,r,n,a,p,i=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(t=i.length>0&&void 0!==i[0]?i[0]:{},r=i.length>1&&void 0!==i[1]?i[1]:{},n=i.length>2?i[2]:void 0,!t.pimperson||!t.pimpaper){e.next=5;break}return e.abrupt("return",s["c"].getInstance().put("/pimpeople/".concat(t.pimperson,"/pimpapers/").concat(t.pimpaper),r,n));case 5:return a={},Object.assign(r,a),e.next=9,s["c"].getInstance().put("/pimpapers/".concat(t.pimpaper),r,n);case 9:return p=e.sent,e.abrupt("return",p);case 11:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()},{key:"GetDraft",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(){var t,r,n,a,p=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(t=p.length>0&&void 0!==p[0]?p[0]:{},r=p.length>1&&void 0!==p[1]?p[1]:{},n=p.length>2?p[2]:void 0,!t.pimperson){e.next=5;break}return e.abrupt("return",s["c"].getInstance().get("/pimpeople/".concat(t.pimperson,"/pimpapers/getdraft"),n));case 5:return e.next=7,s["c"].getInstance().get("/pimpapers/getdraft",n);case 7:return a=e.sent,a.data.pimpaper=r.pimpaper,e.abrupt("return",a);case 10:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()},{key:"Remove",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(){var t,r,n=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(t=n.length>0&&void 0!==n[0]?n[0]:{},n.length>1&&void 0!==n[1]?n[1]:{},r=n.length>2?n[2]:void 0,!t.pimperson||!t.pimpaper){e.next=5;break}return e.abrupt("return",s["c"].getInstance()["delete"]("/pimpeople/".concat(t.pimperson,"/pimpapers/").concat(t.pimpaper),r));case 5:return e.abrupt("return",s["c"].getInstance()["delete"]("/pimpapers/".concat(t.pimpaper),r));case 6:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()},{key:"Create",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(){var t,r,n,a,p,i=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(t=i.length>0&&void 0!==i[0]?i[0]:{},r=i.length>1&&void 0!==i[1]?i[1]:{},n=i.length>2?i[2]:void 0,!t.pimperson){e.next=7;break}return r.srffrontuf&&"1"===r.srffrontuf||(r[this.APPDEKEY]=null),r.srffrontuf&&delete r.srffrontuf,e.abrupt("return",s["c"].getInstance().post("/pimpeople/".concat(t.pimperson,"/pimpapers"),r,n));case 7:return a={},Object.assign(r,a),r.srffrontuf&&"1"===r.srffrontuf||(r[this.APPDEKEY]=null),r.srffrontuf&&delete r.srffrontuf,JSON.parse(JSON.stringify(t)),e.next=14,s["c"].getInstance().post("/pimpapers",r,n);case 14:return p=e.sent,e.abrupt("return",p);case 16:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}()},{key:"Get",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(){var t,r,n,a=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(t=a.length>0&&void 0!==a[0]?a[0]:{},a.length>1&&void 0!==a[1]?a[1]:{},r=a.length>2?a[2]:void 0,!t.pimperson||!t.pimpaper){e.next=5;break}return e.abrupt("return",s["c"].getInstance().get("/pimpeople/".concat(t.pimperson,"/pimpapers/").concat(t.pimpaper),r));case 5:return e.next=7,s["c"].getInstance().get("/pimpapers/".concat(t.pimpaper),r);case 7:return n=e.sent,e.abrupt("return",n);case 9:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()},{key:"Save",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(){var t,r,n,a,p,i=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(t=i.length>0&&void 0!==i[0]?i[0]:{},r=i.length>1&&void 0!==i[1]?i[1]:{},n=i.length>2?i[2]:void 0,!t.pimperson||!t.pimpaper){e.next=5;break}return e.abrupt("return",s["c"].getInstance().post("/pimpeople/".concat(t.pimperson,"/pimpapers/").concat(t.pimpaper,"/save"),r,n));case 5:return a={},Object.assign(r,a),e.next=9,s["c"].getInstance().post("/pimpapers/".concat(t.pimpaper,"/save"),r,n);case 9:return p=e.sent,e.abrupt("return",p);case 11:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()},{key:"CheckKey",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(){var t,r,n,a=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(t=a.length>0&&void 0!==a[0]?a[0]:{},r=a.length>1&&void 0!==a[1]?a[1]:{},n=a.length>2?a[2]:void 0,!t.pimperson||!t.pimpaper){e.next=5;break}return e.abrupt("return",s["c"].getInstance().post("/pimpeople/".concat(t.pimperson,"/pimpapers/").concat(t.pimpaper,"/checkkey"),r,n));case 5:return e.abrupt("return",s["c"].getInstance().post("/pimpapers/".concat(t.pimpaper,"/checkkey"),r,n));case 6:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()},{key:"FetchDefault",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(){var t,r,n,a,p,i=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(t=i.length>0&&void 0!==i[0]?i[0]:{},r=i.length>1&&void 0!==i[1]?i[1]:{},n=i.length>2?i[2]:void 0,!t.pimperson){e.next=6;break}return a=JSON.parse(JSON.stringify(r)),e.abrupt("return",s["c"].getInstance().get("/pimpeople/".concat(t.pimperson,"/pimpapers/fetchdefault"),a,n));case 6:return p=JSON.parse(JSON.stringify(r)),e.abrupt("return",s["c"].getInstance().get("/pimpapers/fetchdefault",p,n));case 8:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()},{key:"FetchJLSSGR",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(){var t,r,n,a,p,i=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(t=i.length>0&&void 0!==i[0]?i[0]:{},r=i.length>1&&void 0!==i[1]?i[1]:{},n=i.length>2?i[2]:void 0,!t.pimperson){e.next=6;break}return a=JSON.parse(JSON.stringify(r)),e.abrupt("return",s["c"].getInstance().get("/pimpeople/".concat(t.pimperson,"/pimpapers/fetchjlssgr"),a,n));case 6:return p=JSON.parse(JSON.stringify(r)),e.abrupt("return",s["c"].getInstance().get("/pimpapers/fetchjlssgr",p,n));case 8:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()},{key:"FetchJLSSGLY",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(){var t,r,n,a,p,i=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(t=i.length>0&&void 0!==i[0]?i[0]:{},r=i.length>1&&void 0!==i[1]?i[1]:{},n=i.length>2?i[2]:void 0,!t.pimperson){e.next=6;break}return a=JSON.parse(JSON.stringify(r)),e.abrupt("return",s["c"].getInstance().get("/pimpeople/".concat(t.pimperson,"/pimpapers/fetchjlssgly"),a,n));case 6:return p=JSON.parse(JSON.stringify(r)),e.abrupt("return",s["c"].getInstance().get("/pimpapers/fetchjlssgly",p,n));case 8:case"end":return e.stop()}}),e)})));function t(){return e.apply(this,arguments)}return t}()}]),t}(o["a"]);r.d(t,"default",(function(){return f}));var f=function(e){function t(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};return Object(n["a"])(this,t),Object(a["a"])(this,Object(p["a"])(t).call(this,e))}return Object(i["a"])(t,e),t}(m)}}]);