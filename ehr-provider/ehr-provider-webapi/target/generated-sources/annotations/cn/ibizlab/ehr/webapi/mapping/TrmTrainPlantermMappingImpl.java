package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmTrainPlanterm;
import cn.ibizlab.ehr.webapi.dto.TrmTrainPlantermDTO;
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
public class TrmTrainPlantermMappingImpl implements TrmTrainPlantermMapping {

    @Override
    public TrmTrainPlanterm toDomain(TrmTrainPlantermDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmTrainPlanterm trmTrainPlanterm = new TrmTrainPlanterm();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmTrainPlanterm.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmTrainPlanterm.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPxrs() != null ) {
            trmTrainPlanterm.setPxrs( dto.getPxrs() );
        }
        if ( dto.getPxmb() != null ) {
            trmTrainPlanterm.setPxmb( dto.getPxmb() );
        }
        if ( dto.getJhjssj() != null ) {
            trmTrainPlanterm.setJhjssj( dto.getJhjssj() );
        }
        if ( dto.getPxfs() != null ) {
            trmTrainPlanterm.setPxfs( dto.getPxfs() );
        }
        if ( dto.getPxdxlb() != null ) {
            trmTrainPlanterm.setPxdxlb( dto.getPxdxlb() );
        }
        if ( dto.getPxcs() != null ) {
            trmTrainPlanterm.setPxcs( dto.getPxcs() );
        }
        if ( dto.getBjzt() != null ) {
            trmTrainPlanterm.setBjzt( dto.getBjzt() );
        }
        if ( dto.getPxlb() != null ) {
            trmTrainPlanterm.setPxlb( dto.getPxlb() );
        }
        if ( dto.getJhxbm() != null ) {
            trmTrainPlanterm.setJhxbm( dto.getJhxbm() );
        }
        if ( dto.getJscc() != null ) {
            trmTrainPlanterm.setJscc( dto.getJscc() );
        }
        if ( dto.getFyys() != null ) {
            trmTrainPlanterm.setFyys( dto.getFyys() );
        }
        if ( dto.getPxsc() != null ) {
            trmTrainPlanterm.setPxsc( dto.getPxsc() );
        }
        if ( dto.getBzr() != null ) {
            trmTrainPlanterm.setBzr( dto.getBzr() );
        }
        if ( dto.getSpyj() != null ) {
            trmTrainPlanterm.setSpyj( dto.getSpyj() );
        }
        if ( dto.getZt() != null ) {
            trmTrainPlanterm.setZt( dto.getZt() );
        }
        if ( dto.getPxfz() != null ) {
            trmTrainPlanterm.setPxfz( dto.getPxfz() );
        }
        if ( dto.getSfqdpxxy() != null ) {
            trmTrainPlanterm.setSfqdpxxy( dto.getSfqdpxxy() );
        }
        if ( dto.getJhkssj() != null ) {
            trmTrainPlanterm.setJhkssj( dto.getJhkssj() );
        }
        if ( dto.getPxnr() != null ) {
            trmTrainPlanterm.setPxnr( dto.getPxnr() );
        }
        if ( dto.getTrmtrainplantermname() != null ) {
            trmTrainPlanterm.setTrmtrainplantermname( dto.getTrmtrainplantermname() );
        }
        if ( dto.getNd() != null ) {
            trmTrainPlanterm.setNd( dto.getNd() );
        }
        if ( dto.getTrmtrainplanid() != null ) {
            trmTrainPlanterm.setTrmtrainplanid( dto.getTrmtrainplanid() );
        }
        if ( dto.getTrmtrainteacherid() != null ) {
            trmTrainPlanterm.setTrmtrainteacherid( dto.getTrmtrainteacherid() );
        }
        if ( dto.getTrmtrainagencyid() != null ) {
            trmTrainPlanterm.setTrmtrainagencyid( dto.getTrmtrainagencyid() );
        }
        if ( dto.getTrmtraincourseid() != null ) {
            trmTrainPlanterm.setTrmtraincourseid( dto.getTrmtraincourseid() );
        }
        if ( dto.getUpdateman() != null ) {
            trmTrainPlanterm.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            trmTrainPlanterm.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getEnable() != null ) {
            trmTrainPlanterm.setEnable( dto.getEnable() );
        }
        if ( dto.getCreateman() != null ) {
            trmTrainPlanterm.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmTrainPlanterm.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getTrmtrainplantermid() != null ) {
            trmTrainPlanterm.setTrmtrainplantermid( dto.getTrmtrainplantermid() );
        }
        if ( dto.getTrmdemdeftionname() != null ) {
            trmTrainPlanterm.setTrmdemdeftionname( dto.getTrmdemdeftionname() );
        }
        if ( dto.getTrmtrainagencyname() != null ) {
            trmTrainPlanterm.setTrmtrainagencyname( dto.getTrmtrainagencyname() );
        }
        if ( dto.getTrmtraincoursename() != null ) {
            trmTrainPlanterm.setTrmtraincoursename( dto.getTrmtraincoursename() );
        }
        if ( dto.getPxdd() != null ) {
            trmTrainPlanterm.setPxdd( dto.getPxdd() );
        }
        if ( dto.getPxkssj() != null ) {
            trmTrainPlanterm.setPxkssj( dto.getPxkssj() );
        }
        if ( dto.getPxjssj() != null ) {
            trmTrainPlanterm.setPxjssj( dto.getPxjssj() );
        }
        if ( dto.getTrmtrainteachername() != null ) {
            trmTrainPlanterm.setTrmtrainteachername( dto.getTrmtrainteachername() );
        }
        if ( dto.getTrmtrainplanname() != null ) {
            trmTrainPlanterm.setTrmtrainplanname( dto.getTrmtrainplanname() );
        }

        return trmTrainPlanterm;
    }

    @Override
    public TrmTrainPlantermDTO toDto(TrmTrainPlanterm entity) {
        if ( entity == null ) {
            return null;
        }

        TrmTrainPlantermDTO trmTrainPlantermDTO = new TrmTrainPlantermDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmTrainPlantermDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmTrainPlantermDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPxrs() != null ) {
            trmTrainPlantermDTO.setPxrs( entity.getPxrs() );
        }
        if ( entity.getPxmb() != null ) {
            trmTrainPlantermDTO.setPxmb( entity.getPxmb() );
        }
        if ( entity.getJhjssj() != null ) {
            trmTrainPlantermDTO.setJhjssj( entity.getJhjssj() );
        }
        if ( entity.getPxfs() != null ) {
            trmTrainPlantermDTO.setPxfs( entity.getPxfs() );
        }
        if ( entity.getPxdxlb() != null ) {
            trmTrainPlantermDTO.setPxdxlb( entity.getPxdxlb() );
        }
        if ( entity.getPxcs() != null ) {
            trmTrainPlantermDTO.setPxcs( entity.getPxcs() );
        }
        if ( entity.getBjzt() != null ) {
            trmTrainPlantermDTO.setBjzt( entity.getBjzt() );
        }
        if ( entity.getPxlb() != null ) {
            trmTrainPlantermDTO.setPxlb( entity.getPxlb() );
        }
        if ( entity.getJhxbm() != null ) {
            trmTrainPlantermDTO.setJhxbm( entity.getJhxbm() );
        }
        if ( entity.getJscc() != null ) {
            trmTrainPlantermDTO.setJscc( entity.getJscc() );
        }
        if ( entity.getFyys() != null ) {
            trmTrainPlantermDTO.setFyys( entity.getFyys() );
        }
        if ( entity.getPxsc() != null ) {
            trmTrainPlantermDTO.setPxsc( entity.getPxsc() );
        }
        if ( entity.getBzr() != null ) {
            trmTrainPlantermDTO.setBzr( entity.getBzr() );
        }
        if ( entity.getSpyj() != null ) {
            trmTrainPlantermDTO.setSpyj( entity.getSpyj() );
        }
        if ( entity.getZt() != null ) {
            trmTrainPlantermDTO.setZt( entity.getZt() );
        }
        if ( entity.getPxfz() != null ) {
            trmTrainPlantermDTO.setPxfz( entity.getPxfz() );
        }
        if ( entity.getSfqdpxxy() != null ) {
            trmTrainPlantermDTO.setSfqdpxxy( entity.getSfqdpxxy() );
        }
        if ( entity.getJhkssj() != null ) {
            trmTrainPlantermDTO.setJhkssj( entity.getJhkssj() );
        }
        if ( entity.getPxnr() != null ) {
            trmTrainPlantermDTO.setPxnr( entity.getPxnr() );
        }
        if ( entity.getTrmtrainplantermname() != null ) {
            trmTrainPlantermDTO.setTrmtrainplantermname( entity.getTrmtrainplantermname() );
        }
        if ( entity.getNd() != null ) {
            trmTrainPlantermDTO.setNd( entity.getNd() );
        }
        if ( entity.getTrmtrainplanid() != null ) {
            trmTrainPlantermDTO.setTrmtrainplanid( entity.getTrmtrainplanid() );
        }
        if ( entity.getTrmtrainteacherid() != null ) {
            trmTrainPlantermDTO.setTrmtrainteacherid( entity.getTrmtrainteacherid() );
        }
        if ( entity.getTrmtrainagencyid() != null ) {
            trmTrainPlantermDTO.setTrmtrainagencyid( entity.getTrmtrainagencyid() );
        }
        if ( entity.getTrmtraincourseid() != null ) {
            trmTrainPlantermDTO.setTrmtraincourseid( entity.getTrmtraincourseid() );
        }
        if ( entity.getUpdateman() != null ) {
            trmTrainPlantermDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            trmTrainPlantermDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getEnable() != null ) {
            trmTrainPlantermDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreateman() != null ) {
            trmTrainPlantermDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmTrainPlantermDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getTrmtrainplantermid() != null ) {
            trmTrainPlantermDTO.setTrmtrainplantermid( entity.getTrmtrainplantermid() );
        }
        if ( entity.getTrmdemdeftionname() != null ) {
            trmTrainPlantermDTO.setTrmdemdeftionname( entity.getTrmdemdeftionname() );
        }
        if ( entity.getTrmtrainagencyname() != null ) {
            trmTrainPlantermDTO.setTrmtrainagencyname( entity.getTrmtrainagencyname() );
        }
        if ( entity.getTrmtraincoursename() != null ) {
            trmTrainPlantermDTO.setTrmtraincoursename( entity.getTrmtraincoursename() );
        }
        if ( entity.getPxdd() != null ) {
            trmTrainPlantermDTO.setPxdd( entity.getPxdd() );
        }
        if ( entity.getPxkssj() != null ) {
            trmTrainPlantermDTO.setPxkssj( entity.getPxkssj() );
        }
        if ( entity.getPxjssj() != null ) {
            trmTrainPlantermDTO.setPxjssj( entity.getPxjssj() );
        }
        if ( entity.getTrmtrainteachername() != null ) {
            trmTrainPlantermDTO.setTrmtrainteachername( entity.getTrmtrainteachername() );
        }
        if ( entity.getTrmtrainplanname() != null ) {
            trmTrainPlantermDTO.setTrmtrainplanname( entity.getTrmtrainplanname() );
        }

        return trmTrainPlantermDTO;
    }

    @Override
    public List<TrmTrainPlanterm> toDomain(List<TrmTrainPlantermDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmTrainPlanterm> list = new ArrayList<TrmTrainPlanterm>( dtoList.size() );
        for ( TrmTrainPlantermDTO trmTrainPlantermDTO : dtoList ) {
            list.add( toDomain( trmTrainPlantermDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmTrainPlantermDTO> toDto(List<TrmTrainPlanterm> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmTrainPlantermDTO> list = new ArrayList<TrmTrainPlantermDTO>( entityList.size() );
        for ( TrmTrainPlanterm trmTrainPlanterm : entityList ) {
            list.add( toDto( trmTrainPlanterm ) );
        }

        return list;
    }
}
