package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmTrainPlan;
import cn.ibizlab.ehr.webapi.dto.TrmTrainPlanDTO;
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
    date = "2021-09-04T00:31:51+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmTrainPlanMappingImpl implements TrmTrainPlanMapping {

    @Override
    public TrmTrainPlan toDomain(TrmTrainPlanDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmTrainPlan trmTrainPlan = new TrmTrainPlan();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmTrainPlan.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmTrainPlan.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getLclx() != null ) {
            trmTrainPlan.setLclx( dto.getLclx() );
        }
        if ( dto.getSdfy() != null ) {
            trmTrainPlan.setSdfy( dto.getSdfy() );
        }
        if ( dto.getYsze() != null ) {
            trmTrainPlan.setYsze( dto.getYsze() );
        }
        if ( dto.getShfs() != null ) {
            trmTrainPlan.setShfs( dto.getShfs() );
        }
        if ( dto.getJhkssj() != null ) {
            trmTrainPlan.setJhkssj( dto.getJhkssj() );
        }
        if ( dto.getXh() != null ) {
            trmTrainPlan.setXh( dto.getXh() );
        }
        if ( dto.getJhyd() != null ) {
            trmTrainPlan.setJhyd( dto.getJhyd() );
        }
        if ( dto.getBzsj() != null ) {
            trmTrainPlan.setBzsj( dto.getBzsj() );
        }
        if ( dto.getNpxqs() != null ) {
            trmTrainPlan.setNpxqs( dto.getNpxqs() );
        }
        if ( dto.getJhnd() != null ) {
            trmTrainPlan.setJhnd( dto.getJhnd() );
        }
        if ( dto.getJhjssj() != null ) {
            trmTrainPlan.setJhjssj( dto.getJhjssj() );
        }
        if ( dto.getJhjb() != null ) {
            trmTrainPlan.setJhjb( dto.getJhjb() );
        }
        if ( dto.getBmjzsj() != null ) {
            trmTrainPlan.setBmjzsj( dto.getBmjzsj() );
        }
        if ( dto.getJhbm() != null ) {
            trmTrainPlan.setJhbm( dto.getJhbm() );
        }
        if ( dto.getJhlx() != null ) {
            trmTrainPlan.setJhlx( dto.getJhlx() );
        }
        if ( dto.getTrmtrainplanname() != null ) {
            trmTrainPlan.setTrmtrainplanname( dto.getTrmtrainplanname() );
        }
        if ( dto.getNpxks() != null ) {
            trmTrainPlan.setNpxks( dto.getNpxks() );
        }
        if ( dto.getJhjd() != null ) {
            trmTrainPlan.setJhjd( dto.getJhjd() );
        }
        if ( dto.getBz() != null ) {
            trmTrainPlan.setBz( dto.getBz() );
        }
        if ( dto.getPimpersonid() != null ) {
            trmTrainPlan.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getTrmdemdeftionid() != null ) {
            trmTrainPlan.setTrmdemdeftionid( dto.getTrmdemdeftionid() );
        }
        if ( dto.getTrmplanformuid() != null ) {
            trmTrainPlan.setTrmplanformuid( dto.getTrmplanformuid() );
        }
        if ( dto.getOrmorgid() != null ) {
            trmTrainPlan.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getPxadress() != null ) {
            trmTrainPlan.setPxadress( dto.getPxadress() );
        }
        if ( dto.getPxcontent() != null ) {
            trmTrainPlan.setPxcontent( dto.getPxcontent() );
        }
        if ( dto.getPxnum() != null ) {
            trmTrainPlan.setPxnum( dto.getPxnum() );
        }
        if ( dto.getApprovalstatus() != null ) {
            trmTrainPlan.setApprovalstatus( dto.getApprovalstatus() );
        }
        if ( dto.getTrmtrainplanid() != null ) {
            trmTrainPlan.setTrmtrainplanid( dto.getTrmtrainplanid() );
        }
        if ( dto.getEnable() != null ) {
            trmTrainPlan.setEnable( dto.getEnable() );
        }
        if ( dto.getCreateman() != null ) {
            trmTrainPlan.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmTrainPlan.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            trmTrainPlan.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            trmTrainPlan.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPxdx() != null ) {
            trmTrainPlan.setPxdx( dto.getPxdx() );
        }
        if ( dto.getPimpersonname() != null ) {
            trmTrainPlan.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getTrmplanformuname() != null ) {
            trmTrainPlan.setTrmplanformuname( dto.getTrmplanformuname() );
        }
        if ( dto.getOrmorgname() != null ) {
            trmTrainPlan.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getTrmdemdeftionname() != null ) {
            trmTrainPlan.setTrmdemdeftionname( dto.getTrmdemdeftionname() );
        }
        if ( dto.getPxrs() != null ) {
            trmTrainPlan.setPxrs( dto.getPxrs() );
        }
        if ( dto.getPxzynr() != null ) {
            trmTrainPlan.setPxzynr( dto.getPxzynr() );
        }
        if ( dto.getPxkssj() != null ) {
            trmTrainPlan.setPxkssj( dto.getPxkssj() );
        }
        if ( dto.getPxdd() != null ) {
            trmTrainPlan.setPxdd( dto.getPxdd() );
        }
        if ( dto.getPxjssj() != null ) {
            trmTrainPlan.setPxjssj( dto.getPxjssj() );
        }

        return trmTrainPlan;
    }

    @Override
    public TrmTrainPlanDTO toDto(TrmTrainPlan entity) {
        if ( entity == null ) {
            return null;
        }

        TrmTrainPlanDTO trmTrainPlanDTO = new TrmTrainPlanDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmTrainPlanDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmTrainPlanDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getLclx() != null ) {
            trmTrainPlanDTO.setLclx( entity.getLclx() );
        }
        if ( entity.getSdfy() != null ) {
            trmTrainPlanDTO.setSdfy( entity.getSdfy() );
        }
        if ( entity.getYsze() != null ) {
            trmTrainPlanDTO.setYsze( entity.getYsze() );
        }
        if ( entity.getShfs() != null ) {
            trmTrainPlanDTO.setShfs( entity.getShfs() );
        }
        if ( entity.getJhkssj() != null ) {
            trmTrainPlanDTO.setJhkssj( entity.getJhkssj() );
        }
        if ( entity.getXh() != null ) {
            trmTrainPlanDTO.setXh( entity.getXh() );
        }
        if ( entity.getJhyd() != null ) {
            trmTrainPlanDTO.setJhyd( entity.getJhyd() );
        }
        if ( entity.getBzsj() != null ) {
            trmTrainPlanDTO.setBzsj( entity.getBzsj() );
        }
        if ( entity.getNpxqs() != null ) {
            trmTrainPlanDTO.setNpxqs( entity.getNpxqs() );
        }
        if ( entity.getJhnd() != null ) {
            trmTrainPlanDTO.setJhnd( entity.getJhnd() );
        }
        if ( entity.getJhjssj() != null ) {
            trmTrainPlanDTO.setJhjssj( entity.getJhjssj() );
        }
        if ( entity.getJhjb() != null ) {
            trmTrainPlanDTO.setJhjb( entity.getJhjb() );
        }
        if ( entity.getBmjzsj() != null ) {
            trmTrainPlanDTO.setBmjzsj( entity.getBmjzsj() );
        }
        if ( entity.getJhbm() != null ) {
            trmTrainPlanDTO.setJhbm( entity.getJhbm() );
        }
        if ( entity.getJhlx() != null ) {
            trmTrainPlanDTO.setJhlx( entity.getJhlx() );
        }
        if ( entity.getTrmtrainplanname() != null ) {
            trmTrainPlanDTO.setTrmtrainplanname( entity.getTrmtrainplanname() );
        }
        if ( entity.getNpxks() != null ) {
            trmTrainPlanDTO.setNpxks( entity.getNpxks() );
        }
        if ( entity.getJhjd() != null ) {
            trmTrainPlanDTO.setJhjd( entity.getJhjd() );
        }
        if ( entity.getBz() != null ) {
            trmTrainPlanDTO.setBz( entity.getBz() );
        }
        if ( entity.getPimpersonid() != null ) {
            trmTrainPlanDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getTrmdemdeftionid() != null ) {
            trmTrainPlanDTO.setTrmdemdeftionid( entity.getTrmdemdeftionid() );
        }
        if ( entity.getTrmplanformuid() != null ) {
            trmTrainPlanDTO.setTrmplanformuid( entity.getTrmplanformuid() );
        }
        if ( entity.getOrmorgid() != null ) {
            trmTrainPlanDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getPxadress() != null ) {
            trmTrainPlanDTO.setPxadress( entity.getPxadress() );
        }
        if ( entity.getPxcontent() != null ) {
            trmTrainPlanDTO.setPxcontent( entity.getPxcontent() );
        }
        if ( entity.getPxnum() != null ) {
            trmTrainPlanDTO.setPxnum( entity.getPxnum() );
        }
        if ( entity.getApprovalstatus() != null ) {
            trmTrainPlanDTO.setApprovalstatus( entity.getApprovalstatus() );
        }
        if ( entity.getTrmtrainplanid() != null ) {
            trmTrainPlanDTO.setTrmtrainplanid( entity.getTrmtrainplanid() );
        }
        if ( entity.getEnable() != null ) {
            trmTrainPlanDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreateman() != null ) {
            trmTrainPlanDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmTrainPlanDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            trmTrainPlanDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            trmTrainPlanDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPxdx() != null ) {
            trmTrainPlanDTO.setPxdx( entity.getPxdx() );
        }
        if ( entity.getPimpersonname() != null ) {
            trmTrainPlanDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getTrmplanformuname() != null ) {
            trmTrainPlanDTO.setTrmplanformuname( entity.getTrmplanformuname() );
        }
        if ( entity.getOrmorgname() != null ) {
            trmTrainPlanDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getTrmdemdeftionname() != null ) {
            trmTrainPlanDTO.setTrmdemdeftionname( entity.getTrmdemdeftionname() );
        }
        if ( entity.getPxrs() != null ) {
            trmTrainPlanDTO.setPxrs( entity.getPxrs() );
        }
        if ( entity.getPxzynr() != null ) {
            trmTrainPlanDTO.setPxzynr( entity.getPxzynr() );
        }
        if ( entity.getPxkssj() != null ) {
            trmTrainPlanDTO.setPxkssj( entity.getPxkssj() );
        }
        if ( entity.getPxdd() != null ) {
            trmTrainPlanDTO.setPxdd( entity.getPxdd() );
        }
        if ( entity.getPxjssj() != null ) {
            trmTrainPlanDTO.setPxjssj( entity.getPxjssj() );
        }

        return trmTrainPlanDTO;
    }

    @Override
    public List<TrmTrainPlan> toDomain(List<TrmTrainPlanDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmTrainPlan> list = new ArrayList<TrmTrainPlan>( dtoList.size() );
        for ( TrmTrainPlanDTO trmTrainPlanDTO : dtoList ) {
            list.add( toDomain( trmTrainPlanDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmTrainPlanDTO> toDto(List<TrmTrainPlan> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmTrainPlanDTO> list = new ArrayList<TrmTrainPlanDTO>( entityList.size() );
        for ( TrmTrainPlan trmTrainPlan : entityList ) {
            list.add( toDto( trmTrainPlan ) );
        }

        return list;
    }
}
