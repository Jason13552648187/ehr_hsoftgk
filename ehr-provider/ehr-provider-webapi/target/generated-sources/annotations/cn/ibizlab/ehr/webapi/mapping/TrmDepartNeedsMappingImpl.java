package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmDepartNeeds;
import cn.ibizlab.ehr.webapi.dto.TrmDepartNeedsDTO;
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
    date = "2021-09-04T00:31:56+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmDepartNeedsMappingImpl implements TrmDepartNeedsMapping {

    @Override
    public TrmDepartNeeds toDomain(TrmDepartNeedsDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmDepartNeeds trmDepartNeeds = new TrmDepartNeeds();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmDepartNeeds.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmDepartNeeds.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPxdfs() != null ) {
            trmDepartNeeds.setPxdfs( dto.getPxdfs() );
        }
        if ( dto.getPxnr() != null ) {
            trmDepartNeeds.setPxnr( dto.getPxnr() );
        }
        if ( dto.getBz() != null ) {
            trmDepartNeeds.setBz( dto.getBz() );
        }
        if ( dto.getYjkssj() != null ) {
            trmDepartNeeds.setYjkssj( dto.getYjkssj() );
        }
        if ( dto.getTrmdepartneedsname() != null ) {
            trmDepartNeeds.setTrmdepartneedsname( dto.getTrmdepartneedsname() );
        }
        if ( dto.getPxscdw() != null ) {
            trmDepartNeeds.setPxscdw( dto.getPxscdw() );
        }
        if ( dto.getYjjssj() != null ) {
            trmDepartNeeds.setYjjssj( dto.getYjjssj() );
        }
        if ( dto.getPxlb() != null ) {
            trmDepartNeeds.setPxlb( dto.getPxlb() );
        }
        if ( dto.getPxmb() != null ) {
            trmDepartNeeds.setPxmb( dto.getPxmb() );
        }
        if ( dto.getSpyj() != null ) {
            trmDepartNeeds.setSpyj( dto.getSpyj() );
        }
        if ( dto.getXqyy() != null ) {
            trmDepartNeeds.setXqyy( dto.getXqyy() );
        }
        if ( dto.getYjfyze() != null ) {
            trmDepartNeeds.setYjfyze( dto.getYjfyze() );
        }
        if ( dto.getPxdd() != null ) {
            trmDepartNeeds.setPxdd( dto.getPxdd() );
        }
        if ( dto.getJpcd() != null ) {
            trmDepartNeeds.setJpcd( dto.getJpcd() );
        }
        if ( dto.getPxsc() != null ) {
            trmDepartNeeds.setPxsc( dto.getPxsc() );
        }
        if ( dto.getTbsj() != null ) {
            trmDepartNeeds.setTbsj( dto.getTbsj() );
        }
        if ( dto.getYjcxrs() != null ) {
            trmDepartNeeds.setYjcxrs( dto.getYjcxrs() );
        }
        if ( dto.getTrmtraincourseid() != null ) {
            trmDepartNeeds.setTrmtraincourseid( dto.getTrmtraincourseid() );
        }
        if ( dto.getTrmtrainagencyid() != null ) {
            trmDepartNeeds.setTrmtrainagencyid( dto.getTrmtrainagencyid() );
        }
        if ( dto.getCreateman() != null ) {
            trmDepartNeeds.setCreateman( dto.getCreateman() );
        }
        if ( dto.getTrmdepartneedsid() != null ) {
            trmDepartNeeds.setTrmdepartneedsid( dto.getTrmdepartneedsid() );
        }
        if ( dto.getUpdateman() != null ) {
            trmDepartNeeds.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            trmDepartNeeds.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmDepartNeeds.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getEnable() != null ) {
            trmDepartNeeds.setEnable( dto.getEnable() );
        }
        if ( dto.getTrmtrainagencyname() != null ) {
            trmDepartNeeds.setTrmtrainagencyname( dto.getTrmtrainagencyname() );
        }
        if ( dto.getTrmtraincoursename() != null ) {
            trmDepartNeeds.setTrmtraincoursename( dto.getTrmtraincoursename() );
        }

        return trmDepartNeeds;
    }

    @Override
    public TrmDepartNeedsDTO toDto(TrmDepartNeeds entity) {
        if ( entity == null ) {
            return null;
        }

        TrmDepartNeedsDTO trmDepartNeedsDTO = new TrmDepartNeedsDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmDepartNeedsDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmDepartNeedsDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPxdfs() != null ) {
            trmDepartNeedsDTO.setPxdfs( entity.getPxdfs() );
        }
        if ( entity.getPxnr() != null ) {
            trmDepartNeedsDTO.setPxnr( entity.getPxnr() );
        }
        if ( entity.getBz() != null ) {
            trmDepartNeedsDTO.setBz( entity.getBz() );
        }
        if ( entity.getYjkssj() != null ) {
            trmDepartNeedsDTO.setYjkssj( entity.getYjkssj() );
        }
        if ( entity.getTrmdepartneedsname() != null ) {
            trmDepartNeedsDTO.setTrmdepartneedsname( entity.getTrmdepartneedsname() );
        }
        if ( entity.getPxscdw() != null ) {
            trmDepartNeedsDTO.setPxscdw( entity.getPxscdw() );
        }
        if ( entity.getYjjssj() != null ) {
            trmDepartNeedsDTO.setYjjssj( entity.getYjjssj() );
        }
        if ( entity.getPxlb() != null ) {
            trmDepartNeedsDTO.setPxlb( entity.getPxlb() );
        }
        if ( entity.getPxmb() != null ) {
            trmDepartNeedsDTO.setPxmb( entity.getPxmb() );
        }
        if ( entity.getSpyj() != null ) {
            trmDepartNeedsDTO.setSpyj( entity.getSpyj() );
        }
        if ( entity.getXqyy() != null ) {
            trmDepartNeedsDTO.setXqyy( entity.getXqyy() );
        }
        if ( entity.getYjfyze() != null ) {
            trmDepartNeedsDTO.setYjfyze( entity.getYjfyze() );
        }
        if ( entity.getPxdd() != null ) {
            trmDepartNeedsDTO.setPxdd( entity.getPxdd() );
        }
        if ( entity.getJpcd() != null ) {
            trmDepartNeedsDTO.setJpcd( entity.getJpcd() );
        }
        if ( entity.getPxsc() != null ) {
            trmDepartNeedsDTO.setPxsc( entity.getPxsc() );
        }
        if ( entity.getTbsj() != null ) {
            trmDepartNeedsDTO.setTbsj( entity.getTbsj() );
        }
        if ( entity.getYjcxrs() != null ) {
            trmDepartNeedsDTO.setYjcxrs( entity.getYjcxrs() );
        }
        if ( entity.getTrmtraincourseid() != null ) {
            trmDepartNeedsDTO.setTrmtraincourseid( entity.getTrmtraincourseid() );
        }
        if ( entity.getTrmtrainagencyid() != null ) {
            trmDepartNeedsDTO.setTrmtrainagencyid( entity.getTrmtrainagencyid() );
        }
        if ( entity.getCreateman() != null ) {
            trmDepartNeedsDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getTrmdepartneedsid() != null ) {
            trmDepartNeedsDTO.setTrmdepartneedsid( entity.getTrmdepartneedsid() );
        }
        if ( entity.getUpdateman() != null ) {
            trmDepartNeedsDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            trmDepartNeedsDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmDepartNeedsDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getEnable() != null ) {
            trmDepartNeedsDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getTrmtrainagencyname() != null ) {
            trmDepartNeedsDTO.setTrmtrainagencyname( entity.getTrmtrainagencyname() );
        }
        if ( entity.getTrmtraincoursename() != null ) {
            trmDepartNeedsDTO.setTrmtraincoursename( entity.getTrmtraincoursename() );
        }

        return trmDepartNeedsDTO;
    }

    @Override
    public List<TrmDepartNeeds> toDomain(List<TrmDepartNeedsDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmDepartNeeds> list = new ArrayList<TrmDepartNeeds>( dtoList.size() );
        for ( TrmDepartNeedsDTO trmDepartNeedsDTO : dtoList ) {
            list.add( toDomain( trmDepartNeedsDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmDepartNeedsDTO> toDto(List<TrmDepartNeeds> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmDepartNeedsDTO> list = new ArrayList<TrmDepartNeedsDTO>( entityList.size() );
        for ( TrmDepartNeeds trmDepartNeeds : entityList ) {
            list.add( toDto( trmDepartNeeds ) );
        }

        return list;
    }
}
