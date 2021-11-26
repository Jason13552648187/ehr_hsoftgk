package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmInvoice;
import cn.ibizlab.ehr.webapi.dto.TrmInvoiceDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:46+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmInvoiceMappingImpl implements TrmInvoiceMapping {

    @Override
    public TrmInvoice toDomain(TrmInvoiceDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmInvoice trmInvoice = new TrmInvoice();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmInvoice.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmInvoice.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getDz() != null ) {
            trmInvoice.setDz( dto.getDz() );
        }
        if ( dto.getKpr() != null ) {
            trmInvoice.setKpr( dto.getKpr() );
        }
        if ( dto.getKplx() != null ) {
            trmInvoice.setKplx( dto.getKplx() );
        }
        if ( dto.getKhhzh() != null ) {
            trmInvoice.setKhhzh( dto.getKhhzh() );
        }
        if ( dto.getKhh() != null ) {
            trmInvoice.setKhh( dto.getKhh() );
        }
        if ( dto.getTrminvoicename() != null ) {
            trmInvoice.setTrminvoicename( dto.getTrminvoicename() );
        }
        if ( dto.getNsrsbh() != null ) {
            trmInvoice.setNsrsbh( dto.getNsrsbh() );
        }
        if ( dto.getDh() != null ) {
            trmInvoice.setDh( dto.getDh() );
        }
        if ( dto.getBz() != null ) {
            trmInvoice.setBz( dto.getBz() );
        }
        if ( dto.getTrmtrainagencyid() != null ) {
            trmInvoice.setTrmtrainagencyid( dto.getTrmtrainagencyid() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmInvoice.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            trmInvoice.setCreateman( dto.getCreateman() );
        }
        if ( dto.getEnable() != null ) {
            trmInvoice.setEnable( dto.getEnable() );
        }
        if ( dto.getTrminvoiceid() != null ) {
            trmInvoice.setTrminvoiceid( dto.getTrminvoiceid() );
        }
        if ( dto.getCreatedate() != null ) {
            trmInvoice.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            trmInvoice.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getTrmtrainagencyname() != null ) {
            trmInvoice.setTrmtrainagencyname( dto.getTrmtrainagencyname() );
        }

        return trmInvoice;
    }

    @Override
    public TrmInvoiceDTO toDto(TrmInvoice entity) {
        if ( entity == null ) {
            return null;
        }

        TrmInvoiceDTO trmInvoiceDTO = new TrmInvoiceDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmInvoiceDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmInvoiceDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getDz() != null ) {
            trmInvoiceDTO.setDz( entity.getDz() );
        }
        if ( entity.getKpr() != null ) {
            trmInvoiceDTO.setKpr( entity.getKpr() );
        }
        if ( entity.getKplx() != null ) {
            trmInvoiceDTO.setKplx( entity.getKplx() );
        }
        if ( entity.getKhhzh() != null ) {
            trmInvoiceDTO.setKhhzh( entity.getKhhzh() );
        }
        if ( entity.getKhh() != null ) {
            trmInvoiceDTO.setKhh( entity.getKhh() );
        }
        if ( entity.getTrminvoicename() != null ) {
            trmInvoiceDTO.setTrminvoicename( entity.getTrminvoicename() );
        }
        if ( entity.getNsrsbh() != null ) {
            trmInvoiceDTO.setNsrsbh( entity.getNsrsbh() );
        }
        if ( entity.getDh() != null ) {
            trmInvoiceDTO.setDh( entity.getDh() );
        }
        if ( entity.getBz() != null ) {
            trmInvoiceDTO.setBz( entity.getBz() );
        }
        if ( entity.getTrmtrainagencyid() != null ) {
            trmInvoiceDTO.setTrmtrainagencyid( entity.getTrmtrainagencyid() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmInvoiceDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            trmInvoiceDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getEnable() != null ) {
            trmInvoiceDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getTrminvoiceid() != null ) {
            trmInvoiceDTO.setTrminvoiceid( entity.getTrminvoiceid() );
        }
        if ( entity.getCreatedate() != null ) {
            trmInvoiceDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            trmInvoiceDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getTrmtrainagencyname() != null ) {
            trmInvoiceDTO.setTrmtrainagencyname( entity.getTrmtrainagencyname() );
        }

        return trmInvoiceDTO;
    }

    @Override
    public List<TrmInvoice> toDomain(List<TrmInvoiceDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmInvoice> list = new ArrayList<TrmInvoice>( dtoList.size() );
        for ( TrmInvoiceDTO trmInvoiceDTO : dtoList ) {
            list.add( toDomain( trmInvoiceDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmInvoiceDTO> toDto(List<TrmInvoice> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmInvoiceDTO> list = new ArrayList<TrmInvoiceDTO>( entityList.size() );
        for ( TrmInvoice trmInvoice : entityList ) {
            list.add( toDto( trmInvoice ) );
        }

        return list;
    }
}
