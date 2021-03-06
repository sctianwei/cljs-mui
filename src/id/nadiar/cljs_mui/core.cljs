(ns id.nadiar.cljs-mui.core
  (:refer-clojure :exclude [list])
  (:require [id.nadiar.cljs-mui.utils :refer [component-factory]]))

(def into-material-component (partial component-factory js/MaterialUI))

(defn mui-theme-provider [& args] (into-material-component "MuiThemeProvider" args))
(defn app-bar [& args] (into-material-component "AppBar" args))
(defn avatar [& args] (into-material-component "Avatar" args))
(defn backdrop [& args] (into-material-component "Backdrop" args))
(defn badge [& args] (into-material-component "Badge" args))
(defn bottom-navigation [& args] (into-material-component "BottomNavigation" args))
(defn bottom-navigation-action [& args] (into-material-component "BottomNavigationAction" args))
(defn button [& args] (into-material-component "Button" args))
(defn button-base [& args] (into-material-component "ButtonBase" args))
(defn card [& args] (into-material-component "Card" args))
(defn card-action-area [& args] (into-material-component "CardActionArea" args))
(defn card-actions [& args] (into-material-component "CardActions" args))
(defn card-content [& args] (into-material-component "CardContent" args))
(defn card-header [& args] (into-material-component "CardHeader" args))
(defn card-media [& args] (into-material-component "CardMedia" args))
(defn checkbox [& args] (into-material-component "Checkbox" args))
(defn chip [& args] (into-material-component "Chip" args))
(defn circular-progress [& args] (into-material-component "CircularProgress" args))
(defn click-away-listener [& args] (into-material-component "ClickAwayListener" args))
(defn collapse [& args] (into-material-component "Collapse" args))
(defn css-baseline [& args] (into-material-component "CssBaseline" args))
(defn dialog [& args] (into-material-component "Dialog" args))
(defn dialog-actions [& args] (into-material-component "DialogActions" args))
(defn dialog-content [& args] (into-material-component "DialogContent" args))
(defn dialog-content-text [& args] (into-material-component "DialogContentText" args))
(defn dialog-title [& args] (into-material-component "DialogTitle" args))
(defn divider [& args] (into-material-component "Divider" args))
(defn drawer [& args] (into-material-component "Drawer" args))
(defn expansion-panel [& args] (into-material-component "ExpansionPanel" args))
(defn expansion-panel-actions [& args] (into-material-component "ExpansionPanelActions" args))
(defn expansion-panel-details [& args] (into-material-component "ExpansionPanelDetails" args))
(defn expansion-panel-summary [& args] (into-material-component "ExpansionPanelSummary" args))
(defn fade [& args] (into-material-component "Fade" args))
(defn filled-input [& args] (into-material-component "FilledInput" args))
(defn form-control [& args] (into-material-component "FormControl" args))
(defn form-control-label [& args] (into-material-component "FormControlLabel" args))
(defn form-group [& args] (into-material-component "FormGroup" args))
(defn form-helper-text [& args] (into-material-component "FormHelperText" args))
(defn form-label [& args] (into-material-component "FormLabel" args))
(defn grid [& args] (into-material-component "Grid" args))
(defn grid-list [& args] (into-material-component "GridList" args))
(defn grid-list-tile [& args] (into-material-component "GridListTile" args))
(defn grid-list-tile-bar [& args] (into-material-component "GridListTileBar" args))
(defn grow [& args] (into-material-component "Grow" args))
(defn hidden [& args] (into-material-component "Hidden" args))
(defn icon [& args] (into-material-component "Icon" args))
(defn icon-button [& args] (into-material-component "IconButton" args))
(defn input [& args] (into-material-component "Input" args))
(defn input-adornment [& args] (into-material-component "InputAdornment" args))
(defn input-base [& args] (into-material-component "InputBase" args))
(defn input-label [& args] (into-material-component "InputLabel" args))
(defn linear-progress [& args] (into-material-component "LinearProgress" args))
(defn list [& args] (into-material-component "List" args))
(defn list-item [& args] (into-material-component "ListItem" args))
(defn list-item-avatar [& args] (into-material-component "ListItemAvatar" args))
(defn list-item-icon [& args] (into-material-component "ListItemIcon" args))
(defn list-item-secondary-action [& args] (into-material-component "ListItemSecondaryAction" args))
(defn list-item-text [& args] (into-material-component "ListItemText" args))
(defn list-subheader [& args] (into-material-component "ListSubheader" args))
(defn menu [& args] (into-material-component "Menu" args))
(defn menu-item [& args] (into-material-component "MenuItem" args))
(defn menu-list [& args] (into-material-component "MenuList" args))
(defn mobile-stepper [& args] (into-material-component "MobileStepper" args))
(defn modal [& args] (into-material-component "Modal" args))
(defn modal-manager [& args] (into-material-component "ModalManager" args))
(defn native-select [& args] (into-material-component "NativeSelect" args))
(defn no-ssr [& args] (into-material-component "NoSsr" args))
(defn outlined-input [& args] (into-material-component "OutlinedInput" args))
(defn paper [& args] (into-material-component "Paper" args))
(defn popover [& args] (into-material-component "Popover" args))
(defn popper [& args] (into-material-component "Popper" args))
(defn portal [& args] (into-material-component "Portal" args))
(defn radio [& args] (into-material-component "Radio" args))
(defn radio-group [& args] (into-material-component "RadioGroup" args))
(defn root-ref [& args] (into-material-component "RootRef" args))
(defn select [& args] (into-material-component "Select" args))
(defn slide [& args] (into-material-component "Slide" args))
(defn snackbar [& args] (into-material-component "Snackbar" args))
(defn snackbar-content [& args] (into-material-component "SnackbarContent" args))
(defn step [& args] (into-material-component "Step" args))
(defn step-button [& args] (into-material-component "StepButton" args))
(defn step-connector [& args] (into-material-component "StepConnector" args))
(defn step-content [& args] (into-material-component "StepContent" args))
(defn step-icon [& args] (into-material-component "StepIcon" args))
(defn step-label [& args] (into-material-component "StepLabel" args))
(defn stepper [& args] (into-material-component "Stepper" args))
(defn svg-icon [& args] (into-material-component "SvgIcon" args))
(defn swipeable-drawer [& args] (into-material-component "SwipeableDrawer" args))
(defn switch [& args] (into-material-component "Switch" args))
(defn tab [& args] (into-material-component "Tab" args))
(defn table [& args] (into-material-component "Table" args))
(defn table-body [& args] (into-material-component "TableBody" args))
(defn table-cell [& args] (into-material-component "TableCell" args))
(defn table-footer [& args] (into-material-component "TableFooter" args))
(defn table-head [& args] (into-material-component "TableHead" args))
(defn table-pagination [& args] (into-material-component "TablePagination" args))
(defn table-row [& args] (into-material-component "TableRow" args))
(defn table-sort-label [& args] (into-material-component "TableSortLabel" args))
(defn tabs [& args] (into-material-component "Tabs" args))
(defn text-field [& args] (into-material-component "TextField" args))
(defn toolbar [& args] (into-material-component "Toolbar" args))
(defn tooltip [& args] (into-material-component "Tooltip" args))
(defn typography [& args] (into-material-component "Typography" args))
(defn zoom [& args] (into-material-component "Zoom" args))