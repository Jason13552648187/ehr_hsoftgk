package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmStaffnodes;
import cn.ibizlab.ehr.webapi.dto.TrmStaffnodesDTO;
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
public class TrmStaffnodesMappingImpl implements TrmStaffnodesMapping {

    @Override
    public TrmStaffnodes toDomain(TrmStaffnodesDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmStaffnodes trmStaffnodes = new TrmStaffnodes();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmStaffnodes.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmStaffnodes.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getXqyy() != null ) {
            trmStaffnodes.setXqyy( dto.getXqyy() );
        }
        if ( dto.getBz() != null ) {
            trmStaffnodes.setBz( dto.getBz() );
        }
        if ( dto.getPxscdw() != null ) {
            trmStaffnodes.setPxscdw( dto.getPxscdw() );
        }
        if ( dto.getYjfyze() != null ) {
            trmStaffnodes.setYjfyze( dto.getYjfyze() );
        }
        if ( dto.getPxdd() != null ) {
            trmStaffnodes.setPxdd( dto.getPxdd() );
        }
        if ( dto.getPxnr() != null ) {
            trmStaffnodes.setPxnr( dto.getPxnr() );
        }
        if ( dto.getTrmstaffnodesname() != null ) {
            trmStaffnodes.setTrmstaffnodesname( dto.getTrmstaffnodesname() );
        }
        if ( dto.getPxmb() != null ) {
            trmStaffnodes.setPxmb( dto.getPxmb() );
        }
        if ( dto.getPxfs() != null ) {
            trmStaffnodes.setPxfs( dto.getPxfs() );
        }
        if ( dto.getTbsj() != null ) {
            trmStaffnodes.setTbsj( dto.getTbsj() );
        }
        if ( dto.getSpyj() != null ) {
            trmStaffnodes.setSpyj( dto.getSpyj() );
        }
        if ( dto.getPxlb() != null ) {
            trmStaffnodes.setPxlb( dto.getPxlb() );
        }
        if ( dto.getPxsc() != null ) {
            trmStaffnodes.setPxsc( dto.getPxsc() );
        }
        if ( dto.getYjjssj() != null ) {
            trmStaffnodes.setYjjssj( dto.getYjjssj() );
        }
        if ( dto.getYjkssj() != null ) {
            trmStaffnodes.setYjkssj( dto.getYjkssj() );
        }
        if ( dto.getJpcd() != null ) {
            trmStaffnodes.setJpcd( dto.getJpcd() );
        }
        if ( dto.getTrmtraincourseid() != null ) {
            trmStaffnodes.setTrmtraincourseid( dto.getTrmtraincourseid() );
        }
        if ( dto.getTrmtrainagencyid() != null ) {
            trmStaffnodes.setTrmtrainagencyid( dto.getTrmtrainagencyid() );
        }
        if ( dto.getTrmstaffid() != null ) {
            trmStaffnodes.setTrmstaffid( dto.getTrmstaffid() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmStaffnodes.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            trmStaffnodes.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            trmStaffnodes.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getEnable() != null ) {
            trmStaffnodes.setEnable( dto.getEnable() );
        }
        if ( dto.getCreateman() != null ) {
            trmStaffnodes.setCreateman( dto.getCreateman() );
        }
        if ( dto.getTrmstaffnodesid() != null ) {
            trmStaffnodes.setTrmstaffnodesid( dto.getTrmstaffnodesid() );
        }
        if ( dto.getTrmstaffname() != null ) {
            trmStaffnodes.setTrmstaffname( dto.getTrmstaffname() );
        }
        if ( dto.getTrmtrainagencyname() != null ) {
            trmStaffnodes.setTrmtrainagencyname( dto.getTrmtrainagencyname() );
        }
        if ( dto.getTrmtraincoursename() != null ) {
            trmStaffnodes.setTrmtraincoursename( dto.getTrmtraincoursename() );
        }

        return trmStaffnodes;
    }

    @Override
    public TrmStaffnodesDTO toDto(TrmStaffnodes entity) {
        if ( entity == null ) {
            return null;
        }

        TrmStaffnodesDTO trmStaffnodesDTO = new TrmStaffnodesDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmStaffnodesDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmStaffnodesDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getXqyy() != null ) {
            trmStaffnodesDTO.setXqyy( entity.getXqyy() );
        }
        if ( entity.getBz() != null ) {
            trmStaffnodesDTO.setBz( entity.getBz() );
        }
        if ( entity.getPxscdw() != null ) {
            trmStaffnodesDTO.setPxscdw( entity.getPxscdw() );
        }
        if ( entity.getYjfyze() != null ) {
            trmStaffnodesDTO.setYjfyze( entity.getYjfyze() );
        }
        if ( entity.getPxdd() != null ) {
            trmStaffnodesDTO.setPxdd( entity.getPxdd() );
        }
        if ( entity.getPxnr() != null ) {
            trmStaffnodesDTO.setPxnr( entity.getPxnr() );
        }
        if ( entity.getTrmstaffnodesname() != null ) {
            trmStaffnodesDTO.setTrmstaffnodesname( entity.getTrmstaffnodesname() );
        }
        if ( entity.getPxmb() != null ) {
            trmStaffnodesDTO.setPxmb( entity.getPxmb() );
        }
        if ( entity.getPxfs() != null ) {
            trmStaffnodesDTO.setPxfs( entity.getPxfs() );
        }
        if ( entity.getTbsj() != null ) {
            trmStaffnodesDTO.setTbsj( entity.getTbsj() );
        }
        if ( entity.getSpyj() != null ) {
            trmStaffnodesDTO.setSpyj( entity.getSpyj() );
        }
        if ( entity.getPxlb() != null ) {
            trmStaffnodesDTO.setPxlb( entity.getPxlb() );
        }
        if ( entity.getPxsc() != null ) {
            trmStaffnodesDTO.setPxsc( entity.getPxsc() );
        }
        if ( entity.getYjjssj() != null ) {
            trmStaffnodesDTO.setYjjssj( entity.getYjjssj() );
        }
        if ( entity.getYjkssj() != null ) {
            trmStaffnodesDTO.setYjkssj( entity.getYjkssj() );
        }
        if ( entity.getJpcd() != null ) {
            trmStaffnodesDTO.setJpcd( entity.getJpcd() );
        }
        if ( entity.getTrmtraincourseid() != null ) {
            trmStaffnodesDTO.setTrmtraincourseid( entity.getTrmtraincourseid() );
        }
        if ( entity.getTrmtrainagencyid() != null ) {
            trmStaffnodesDTO.setTrmtrainagencyid( entity.getTrmtrainagencyid() );
        }
        if ( entity.getTrmstaffid() != null ) {
            trmStaffnodesDTO.setTrmstaffid( entity.getTrmstaffid() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmStaffnodesDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            trmStaffnodesDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            trmStaffnodesDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getEnable() != null ) {
            trmStaffnodesDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreateman() != null ) {
            trmStaffnodesDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getTrmstaffnodesid() != null ) {
            trmStaffnodesDTO.setTrmstaffnodesid( entity.getTrmstaffnodesid() );
        }
        if ( entity.getTrmstaffname() != null ) {
            trmStaffnodesDTO.setTrmstaffname( entity.getTrmstaffname() );
        }
        if ( entity.getTrmtrainagencyname() != null ) {
            trmStaffnodesDTO.setTrmtrainagencyname( entity.getTrmtrainagencyname() );
        }
        if ( entity.getTrmtraincoursename() != null ) {
            trmStaffnodesDTO.setTrmtraincoursename( entity.getTrmtraincoursename() );
        }

        return trmStaffnodesDTO;
    }

    @Override
    public List<TrmStaffnodes> toDomain(List<TrmStaffnodesDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmStaffnodes> list = new ArrayList<TrmStaffnodes>( dtoList.size() );
        for ( TrmStaffnodesDTO trmStaffnodesDTO : dtoList ) {
            list.add( toDomain( trmStaffnodesDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmStaffnodesDTO> toDto(List<TrmStaffnodes> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmStaffnodesDTO> list = new ArrayList<TrmStaffnodesDTO>( entityList.size() );
        for ( TrmStaffnodes trmStaffnodes : entityList ) {
            list.add( toDto( trmStaffnodes ) );
        }

        return list;
    }
}
