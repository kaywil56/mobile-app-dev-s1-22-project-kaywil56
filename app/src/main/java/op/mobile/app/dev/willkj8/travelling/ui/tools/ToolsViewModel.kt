package op.mobile.app.dev.willkj8.travelling.ui.tools

import androidx.lifecycle.ViewModel
import op.mobile.app.dev.willkj8.travelling.model.Country

/**
 * A view model class for tools.
 *
 * This class handles data related to the tools ui.
 *
 * @param _country The selected country object
 */
class ToolsViewModel(_country: Country) : ViewModel() {
    var country: Country = _country
}