(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-38fb9ede"],{"305a":function(t,e,i){"use strict";var a=i("9ad1"),n=i.n(a);n.a},"3e05":function(t,e,i){"use strict";i.r(e);var a=i("d4ec"),n=i("99de"),o=i("7e84"),r=i("262e"),c=i("9ab4"),s=i("60a3"),l=function(){var t=this,e=t.$createElement,i=t._self._c||e;return i("app-layout",{attrs:{viewName:"pimexitandentryygcgjgridview",viewTitle:"出入境管理实体表格视图（因公出国境）",className:{"view-container":!0,"default-mode-view":!0,degridview:!0,"pimexitandentryygcgjgrid-view":!0},layoutMode:"VIEW",isShowUserInfo:t.isDefaultView(),openMode:t.openMode},on:{"close-view":function(e){return t.closeView(e)}}},[i("template",{slot:"headerLeft"},[i("div",{staticClass:"view-header-left"},[t.isDefaultView()?i("div",{staticClass:"view-caption"},[t._v(t._s(t.$t(t.model.srfCaption)))]):t._e(),t.isModalView()?i("modal-breadcrumb"):t._e()],1)]),i("template",{slot:"headerRight"},[i("div",{staticClass:"view-header-right"},[i("app-header-menus",{attrs:{toolbarModel:t.toolBarModels,mode:"view",openMode:t.openMode,isEnableQuickSearch:!0,searchPlaceholder:"出入境管理名称"},on:{"menu-click":function(e){return t.toolbar_click(e)},search:function(e){return t.onSearch(e)}},model:{value:t.query,callback:function(e){t.query=e},expression:"query"}})],1)]),i("template",{slot:"content"},[i("div",{staticClass:"view-content-wrapper"},[i("view_searchform",{directives:[{name:"show",rawName:"v-show",value:t.isExpandSearchForm,expression:"isExpandSearchForm"}],ref:"searchform",attrs:{viewState:t.viewState,viewparams:t.viewparams,context:t.context,showBusyIndicator:!0,loaddraftAction:"FilterGetDraft",loadAction:"FilterGet",name:"searchform"},on:{save:function(e){return t.searchform_save(e)},search:function(e){return t.searchform_search(e)},load:function(e){return t.searchform_load(e)},closeview:function(e){return t.closeView(e)}}}),i("view_grid",{ref:"grid",attrs:{viewState:t.viewState,viewparams:t.viewparams,context:t.context,isSingleSelect:t.isSingleSelect,showBusyIndicator:!0,isOpenEdit:!1,gridRowActiveMode:t.gridRowActiveMode,updateAction:"",removeAction:"Remove",loaddraftAction:"",loadAction:"",createAction:"",fetchAction:"FetchYGCGJ",newdata:t.newdata,opendata:t.opendata,name:"grid"},on:{save:t.onSave,selectionchange:function(e){return t.grid_selectionchange(e)},beforeload:function(e){return t.grid_beforeload(e)},rowdblclick:function(e){return t.grid_rowdblclick(e)},remove:function(e){return t.grid_remove(e)},load:function(e){return t.grid_load(e)},closeview:function(e){return t.closeView(e)}}})],1)])],2)},d=[],u=(i("a4d3"),i("4de4"),i("4160"),i("1d1c"),i("7a82"),i("e439"),i("dbb4"),i("2b19"),i("b64b"),i("2ca0"),i("159b"),i("ade3")),g=i("2909"),h=i("bee2"),v=i("45eb"),f=i("2bd2"),b=i("46aa"),m=i("b816"),p=i("434b"),w=i("5b72");function y(t,e){var i=Object.keys(t);if(Object.getOwnPropertySymbols){var a=Object.getOwnPropertySymbols(t);e&&(a=a.filter((function(e){return Object.getOwnPropertyDescriptor(t,e).enumerable}))),i.push.apply(i,a)}return i}function _(t){for(var e=1;e<arguments.length;e++){var i=null!=arguments[e]?arguments[e]:{};e%2?y(Object(i),!0).forEach((function(e){Object(u["a"])(t,e,i[e])})):Object.getOwnPropertyDescriptors?Object.defineProperties(t,Object.getOwnPropertyDescriptors(i)):y(Object(i)).forEach((function(e){Object.defineProperty(t,e,Object.getOwnPropertyDescriptor(i,e))}))}return t}var O=function(t){function e(){var t;return Object(a["a"])(this,e),t=Object(n["a"])(this,Object(o["a"])(e).apply(this,arguments)),t.appEntityService=new m["default"],t.counterServiceArray=[],t.viewtag="adafd3d52426b170e4c9731d99309ecb",t.srfparentdata={},t.customViewNavContexts={},t.customViewParams={},t.model={srfCaption:"entities.pimexitandentry.views.ygcgjgridview.caption",srfTitle:"entities.pimexitandentry.views.ygcgjgridview.title",srfSubTitle:"entities.pimexitandentry.views.ygcgjgridview.subtitle",dataInfo:""},t.containerModel={view_toolbar:{name:"toolbar",type:"TOOLBAR"},view_grid:{name:"grid",type:"GRID"},view_searchform:{name:"searchform",type:"SEARCHFORM"},wflinks:[]},t.viewState=new f["a"],t.toolBarModels={tbitem1_newyg:{name:"tbitem1_newyg",caption:"因公新建",isShowCaption:!0,isShowIcon:!0,tooltip:"因公新建",iconcls:"fa fa-file-text-o",icon:"",disabled:!1,type:"DEUIACTION",visabled:!0,dataaccaction:"",uiaction:{tag:"newYG",target:"NONE"},class:""},tbitem1_ksccgj:{name:"tbitem1_ksccgj",caption:"删除",isShowCaption:!0,isShowIcon:!0,tooltip:"删除",iconcls:"fa fa-remove",icon:"",disabled:!1,type:"DEUIACTION",visabled:!0,dataaccaction:"KSCCGJ",uiaction:{tag:"KSCCGJ",target:"SINGLEKEY"},class:""},tbitem16:{name:"tbitem16",caption:"其它",disabled:!1,type:"ITEMS",visabled:!0,dataaccaction:"",uiaction:{},class:""},tbitem23:{name:"tbitem23",caption:"数据导入",isShowCaption:!0,isShowIcon:!0,tooltip:"数据导入",iconcls:"fa fa-upload",icon:"",disabled:!1,type:"DEUIACTION",visabled:!0,dataaccaction:"SRFUR__JGLYYPZSZYJTJ",uiaction:{tag:"Import",target:""},class:""},tbitem13:{name:"tbitem13",caption:"导出数据",isShowCaption:!0,isShowIcon:!0,tooltip:"导出数据",iconcls:"fa fa-file-excel-o",icon:"",disabled:!1,type:"DEUIACTION",visabled:!0,dataaccaction:"",uiaction:{tag:"ExportExcel",target:""},MaxRowCount:5e3,class:""},tbitem19:{name:"tbitem19",caption:"过滤",isShowCaption:!0,isShowIcon:!0,tooltip:"过滤",iconcls:"fa fa-filter",icon:"",disabled:!1,type:"DEUIACTION",visabled:!0,dataaccaction:"SRFUR__JGLYKQLX",uiaction:{tag:"ToggleFilter",target:""},class:""},tbitem18:{name:"tbitem18",caption:"帮助",isShowCaption:!0,isShowIcon:!0,tooltip:"帮助",iconcls:"fa fa-question",icon:"",disabled:!1,type:"DEUIACTION",visabled:!0,dataaccaction:"",uiaction:{tag:"Help",target:""},class:""}},t.engine=new p["a"],t.isSingleSelect=!1,t.query="",t.isExpandSearchForm=!1,t.gridRowActiveMode=2,t}return Object(r["a"])(e,t),Object(h["a"])(e,[{key:"viewDatasChange",value:function(t){return t}},{key:"engineInit",value:function(){var t=this;this.engine.init({view:this,opendata:function(e,i,a,n){t.opendata(e,i,a,n)},newdata:function(e,i,a,n){t.newdata(e,i,a,n)},grid:this.$refs.grid,searchform:this.$refs.searchform,keyPSDEField:"pimexitandentry",majorPSDEField:"pimexitandentryname",isLoadDefault:!0})}},{key:"toolbar_click",value:function(t,e){Object.is(t.tag,"tbitem1_newyg")&&this.toolbar_tbitem1_newyg_click(null,"",e),Object.is(t.tag,"tbitem1_ksccgj")&&this.toolbar_tbitem1_ksccgj_click(null,"",e),Object.is(t.tag,"tbitem5")&&this.toolbar_tbitem5_click(null,"",e),Object.is(t.tag,"tbitem11")&&this.toolbar_tbitem11_click(null,"",e),Object.is(t.tag,"tbitem23")&&this.toolbar_tbitem23_click(null,"",e),Object.is(t.tag,"tbitem13")&&this.toolbar_tbitem13_click(null,"",e),Object.is(t.tag,"tbitem19")&&this.toolbar_tbitem19_click(null,"",e),Object.is(t.tag,"deuiaction1")&&this.toolbar_deuiaction1_click(null,"",e),Object.is(t.tag,"tbitem18")&&this.toolbar_tbitem18_click(null,"",e)}},{key:"grid_selectionchange",value:function(t,e){this.engine.onCtrlEvent("grid","selectionchange",t)}},{key:"grid_beforeload",value:function(t,e){this.engine.onCtrlEvent("grid","beforeload",t)}},{key:"grid_rowdblclick",value:function(t,e){this.engine.onCtrlEvent("grid","rowdblclick",t)}},{key:"grid_remove",value:function(t,e){this.engine.onCtrlEvent("grid","remove",t)}},{key:"grid_load",value:function(t,e){this.engine.onCtrlEvent("grid","load",t)}},{key:"searchform_save",value:function(t,e){this.engine.onCtrlEvent("searchform","save",t)}},{key:"searchform_search",value:function(t,e){this.engine.onCtrlEvent("searchform","search",t)}},{key:"searchform_load",value:function(t,e){this.engine.onCtrlEvent("searchform","load",t)}},{key:"toolbar_tbitem1_newyg_click",value:function(){var t=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{},e=(arguments.length>1&&arguments[1],arguments.length>2?arguments[2]:void 0),i=[],a=null,n={},o={};a=this.$refs.grid,a.getDatas&&a.getDatas instanceof Function&&(i=Object(g["a"])(a.getDatas())),t&&(i=[t]);var r=new w["default"];r.PimExitandentry_newYG(i,o,n,e,a,this,"PimExitandentry")}},{key:"toolbar_tbitem1_ksccgj_click",value:function(){var t=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{},e=(arguments.length>1&&arguments[1],arguments.length>2?arguments[2]:void 0),i=[],a=null,n={},o={};a=this.$refs.grid,a.getDatas&&a.getDatas instanceof Function&&(i=Object(g["a"])(a.getDatas())),t&&(i=[t]);var r=new w["default"];r.PimExitandentry_KSCCGJ(i,o,n,e,a,this,"PimExitandentry")}},{key:"toolbar_tbitem5_click",value:function(){var t=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{},e=(arguments.length>1&&arguments[1],arguments.length>2?arguments[2]:void 0),i=[],a=null,n={},o={};a=this.$refs.grid,a.getDatas&&a.getDatas instanceof Function&&(i=Object(g["a"])(a.getDatas())),t&&(i=[t]),this.View(i,o,n,e,a,this,"PimExitandentry")}},{key:"toolbar_tbitem11_click",value:function(){var t=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{},e=(arguments.length>1&&arguments[1],arguments.length>2?arguments[2]:void 0),i=[],a=null,n={},o={};a=this.$refs.grid,a.getDatas&&a.getDatas instanceof Function&&(i=Object(g["a"])(a.getDatas())),t&&(i=[t]),this.Print(i,o,n,e,a,this,"PimExitandentry")}},{key:"toolbar_tbitem23_click",value:function(){var t=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{},e=(arguments.length>1&&arguments[1],arguments.length>2?arguments[2]:void 0),i=[],a=null,n={},o={};a=this.$refs.grid,a.getDatas&&a.getDatas instanceof Function&&(i=Object(g["a"])(a.getDatas())),t&&(i=[t]),this.Import(i,o,n,e,a,this,"PimExitandentry")}},{key:"toolbar_tbitem13_click",value:function(){var t=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{},e=(arguments.length>1&&arguments[1],arguments.length>2?arguments[2]:void 0),i=[],a=null,n={},o={};a=this.$refs.grid,a.getDatas&&a.getDatas instanceof Function&&(i=Object(g["a"])(a.getDatas())),t&&(i=[t]),this.ExportExcel(i,o,n,e,a,this,"PimExitandentry")}},{key:"toolbar_tbitem19_click",value:function(){var t=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{},e=(arguments.length>1&&arguments[1],arguments.length>2?arguments[2]:void 0),i=[],a=null,n={},o={};a=this.$refs.grid,a.getDatas&&a.getDatas instanceof Function&&(i=Object(g["a"])(a.getDatas())),t&&(i=[t]),this.ToggleFilter(i,o,n,e,a,this,"PimExitandentry")}},{key:"toolbar_deuiaction1_click",value:function(){var t=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{},e=(arguments.length>1&&arguments[1],arguments.length>2?arguments[2]:void 0),i=[],a=null,n={},o={};a=this.$refs.grid,a.getDatas&&a.getDatas instanceof Function&&(i=Object(g["a"])(a.getDatas())),t&&(i=[t]),this.OpenRowEdit(i,o,n,e,a,this,"PimExitandentry")}},{key:"toolbar_tbitem18_click",value:function(){var t=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{},e=(arguments.length>1&&arguments[1],arguments.length>2?arguments[2]:void 0),i=[],a=null,n={},o={};a=this.$refs.grid,a.getDatas&&a.getDatas instanceof Function&&(i=Object(g["a"])(a.getDatas())),t&&(i=[t]),this.Help(i,o,n,e,a,this,"PimExitandentry")}},{key:"newdata",value:function(t,e,i,a,n){this.$Notice.warning({title:"错误",desc:"向导添加未实现"})}},{key:"opendata",value:function(t,e,i,a,n){var o=this,r={},c=JSON.parse(JSON.stringify(this.context));t.length>0&&Object.assign(c,t[0]);var s=[];c.pimperson&&(s=[{pathName:"pimpeople",parameterName:"pimperson"}]);var l=[{pathName:"pimexitandentries",parameterName:"pimexitandentry"},{pathName:"editview",parameterName:"editview"}],d=function(e){var i=o.$viewTool.buildUpRoutePath(o.$route,c,s,l,t,e);o.$router.push(i)};d(r)}},{key:"View",value:function(t,e,i,a,n,o,r){if(0!==t.length){var c=this;if(c.opendata&&c.opendata instanceof Function){var s={};t.length>0&&Object.assign(s,{pimexitandentry:t[0].pimexitandentry}),c.opendata([_({},s)],i,a,n)}else c.$Notice.error({title:"错误",desc:"opendata 视图处理逻辑不存在，请添加!"})}}},{key:"Print",value:function(t,e,i,a,n,o,r){n&&n.print instanceof Function&&a&&n.print()}},{key:"Import",value:function(t,e,i,a,n,o,r){n&&n.importExcel instanceof Function&&a&&n.importExcel(i)}},{key:"ExportExcel",value:function(t,e,i,a,n,o,r){n&&n.exportExcel instanceof Function&&a&&n.exportExcel(a.exportparms)}},{key:"ToggleFilter",value:function(t,e,i,a,n,o,r){var c=this;c.hasOwnProperty("isExpandSearchForm")&&(c.isExpandSearchForm=!c.isExpandSearchForm)}},{key:"OpenRowEdit",value:function(t,e,i,a,n,o,r){}},{key:"Help",value:function(t,e,i,a,n,o,r){this.$Notice.error({title:"错误",desc:"帮助未支持"})}},{key:"destroyed",value:function(){var t=this;if(this.viewDefaultUsage){var e=Object.keys(localStorage);e.length>0&&e.forEach((function(e){e.startsWith(t.context.srfsessionid)&&localStorage.removeItem(e)}))}}},{key:"created",value:function(){var t=this;Object(v["a"])(Object(o["a"])(e.prototype),"created",this).call(this),this.formDruipart&&this.formDruipart.subscribe((function(e){if(Object.is(e.action,"save")&&t.viewState.next({tag:"grid",action:"save",data:t.viewparams}),Object.is(e.action,"load")){var i=t;i.engine.load(e.data,!0)}}))}},{key:"onSearch",value:function(t){var e=this.$refs.grid;e&&e.load(this.context)}},{key:"onSave",value:function(t){this.$emit("drdatasaved",t)}},{key:"onRefreshData",value:function(t,e){if(null!==t&&void 0!==t&&0!==t){var i=this.$refs.grid;i&&i.load({})}}},{key:"refreshdata",get:function(){return this.$store.getters["viewaction/getRefreshData"](this.viewtag)}}]),e}(b["j"]);c["a"]([Object(s["b"])()],O.prototype,"viewDatasChange",null),c["a"]([Object(s["e"])()],O.prototype,"formDruipart",void 0),c["a"]([Object(s["h"])("refreshdata")],O.prototype,"onRefreshData",null),O=c["a"]([Object(s["a"])({}),b["q"]],O);var k=O,j=k,E=(i("305a"),i("2877")),x=Object(E["a"])(j,l,d,!1,null,null,null),S=x.exports,D=i("6698"),C=i("d3c9"),I=function(t){function e(){return Object(a["a"])(this,e),Object(n["a"])(this,Object(o["a"])(e).apply(this,arguments))}return Object(r["a"])(e,t),e}(S);I=c["a"]([Object(s["a"])({components:{view_grid:D["a"],view_searchform:C["a"]},beforeRouteEnter:function(t,e,i){i((function(e){e.$store.commit("addCurPageViewtag",{fullPath:t.fullPath,viewtag:e.viewtag})}))}})],I);var P,F,N=I,$=N,R=Object(E["a"])($,P,F,!1,null,null,null);e["default"]=R.exports},"9ad1":function(t,e,i){}}]);