package op.mobile.app.dev.willkj8.travelling.ui.tools

import androidx.lifecycle.ViewModel
import op.mobile.app.dev.willkj8.travelling.model.Country

class ToolsViewModel(_country: Country) : ViewModel() {
    var country: Country = _country
}