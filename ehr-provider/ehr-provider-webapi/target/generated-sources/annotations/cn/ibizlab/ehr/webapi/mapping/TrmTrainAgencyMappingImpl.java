package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmTrainAgency;
import cn.ibizlab.ehr.webapi.dto.TrmTrainAgencyDTO;
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
    date = "2021-09-04T00:31:53+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmTrainAgencyMappingImpl implements TrmTrainAgencyMapping {

    @Override
    public TrmTrainAgency toDomain(TrmTrainAgencyDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmTrainAgency trmTrainAgency = new TrmTrainAgency();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmTrainAgency.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmTrainAgency.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getKhhmc() != null ) {
            trmTrainAgency.setKhhmc( dto.getKhhmc() );
        }
        if ( dto.getNsrsbh() != null ) {
            trmTrainAgency.setNsrsbh( dto.getNsrsbh() );
        }
        if ( dto.getPxcs() != null ) {
            trmTrainAgency.setPxcs( dto.getPxcs() );
        }
        if ( dto.getKhh() != null ) {
            trmTrainAgency.setKhh( dto.getKhh() );
        }
        if ( dto.getJgdj() != null ) {
            trmTrainAgency.setJgdj( dto.getJgdj() );
        }
        if ( dto.getJglx() != null ) {
            trmTrainAgency.setJglx( dto.getJglx() );
        }
        if ( dto.getSffc() != null ) {
            trmTrainAgency.setSffc( dto.getSffc() );
        }
        if ( dto.getSfgx() != null ) {
            trmTrainAgency.setSfgx( dto.getSfgx() );
        }
        if ( dto.getTrmtrainagencyname() != null ) {
            trmTrainAgency.setTrmtrainagencyname( dto.getTrmtrainagencyname() );
        }
        if ( dto.getLxr() != null ) {
            trmTrainAgency.setLxr( dto.getLxr() );
        }
        if ( dto.getJgbm() != null ) {
            trmTrainAgency.setJgbm( dto.getJgbm() );
        }
        if ( dto.getBz() != null ) {
            trmTrainAgency.setBz( dto.getBz() );
        }
        if ( dto.getWz() != null ) {
            trmTrainAgency.setWz( dto.getWz() );
        }
        if ( dto.getKplx() != null ) {
            trmTrainAgency.setKplx( dto.getKplx() );
        }
        if ( dto.getJglb() != null ) {
            trmTrainAgency.setJglb( dto.getJglb() );
        }
        if ( dto.getZcxx() != null ) {
            trmTrainAgency.setZcxx( dto.getZcxx() );
        }
        if ( dto.getKhhzh() != null ) {
            trmTrainAgency.setKhhzh( dto.getKhhzh() );
        }
        if ( dto.getPxzsc() != null ) {
            trmTrainAgency.setPxzsc( dto.getPxzsc() );
        }
        if ( dto.getKctxfw() != null ) {
            trmTrainAgency.setKctxfw( dto.getKctxfw() );
        }
        if ( dto.getKprdh() != null ) {
            trmTrainAgency.setKprdh( dto.getKprdh() );
        }
        if ( dto.getKpxx() != null ) {
            trmTrainAgency.setKpxx( dto.getKpxx() );
        }
        if ( dto.getDzxx() != null ) {
            trmTrainAgency.setDzxx( dto.getDzxx() );
        }
        if ( dto.getJj() != null ) {
            trmTrainAgency.setJj( dto.getJj() );
        }
        if ( dto.getPj() != null ) {
            trmTrainAgency.setPj( dto.getPj() );
        }
        if ( dto.getKpr() != null ) {
            trmTrainAgency.setKpr( dto.getKpr() );
        }
        if ( dto.getKpmc() != null ) {
            trmTrainAgency.setKpmc( dto.getKpmc() );
        }
        if ( dto.getKpdz() != null ) {
            trmTrainAgency.setKpdz( dto.getKpdz() );
        }
        if ( dto.getLxdh() != null ) {
            trmTrainAgency.setLxdh( dto.getLxdh() );
        }
        if ( dto.getPimpersonid() != null ) {
            trmTrainAgency.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getOrmorgid() != null ) {
            trmTrainAgency.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getTrmtrainagencyid2() != null ) {
            trmTrainAgency.setTrmtrainagencyid2( dto.getTrmtrainagencyid2() );
        }
        if ( dto.getCreateman() != null ) {
            trmTrainAgency.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            trmTrainAgency.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            trmTrainAgency.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmTrainAgency.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getEnable() != null ) {
            trmTrainAgency.setEnable( dto.getEnable() );
        }
        if ( dto.getTrmtrainagencyid() != null ) {
            trmTrainAgency.setTrmtrainagencyid( dto.getTrmtrainagencyid() );
        }
        if ( dto.getTrmtrainagencyname2() != null ) {
            trmTrainAgency.setTrmtrainagencyname2( dto.getTrmtrainagencyname2() );
        }
        if ( dto.getZzdzs() != null ) {
            trmTrainAgency.setZzdzs( dto.getZzdzs() );
        }
        if ( dto.getOrmorgname() != null ) {
            trmTrainAgency.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getPimpersonname() != null ) {
            trmTrainAgency.setPimpersonname( dto.getPimpersonname() );
        }

        return trmTrainAgency;
    }

    @Override
    public TrmTrainAgencyDTO toDto(TrmTrainAgency entity) {
        if ( entity == null ) {
            return null;
        }

        TrmTrainAgencyDTO trmTrainAgencyDTO = new TrmTrainAgencyDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmTrainAgencyDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmTrainAgencyDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getKhhmc() != null ) {
            trmTrainAgencyDTO.setKhhmc( entity.getKhhmc() );
        }
        if ( entity.getNsrsbh() != null ) {
            trmTrainAgencyDTO.setNsrsbh( entity.getNsrsbh() );
        }
        if ( entity.getPxcs() != null ) {
            trmTrainAgencyDTO.setPxcs( entity.getPxcs() );
        }
        if ( entity.getKhh() != null ) {
            trmTrainAgencyDTO.setKhh( entity.getKhh() );
        }
        if ( entity.getJgdj() != null ) {
            trmTrainAgencyDTO.setJgdj( entity.getJgdj() );
        }
        if ( entity.getJglx() != null ) {
            trmTrainAgencyDTO.setJglx( entity.getJglx() );
        }
        if ( entity.getSffc() != null ) {
            trmTrainAgencyDTO.setSffc( entity.getSffc() );
        }
        if ( entity.getSfgx() != null ) {
            trmTrainAgencyDTO.setSfgx( entity.getSfgx() );
        }
        if ( entity.getTrmtrainagencyname() != null ) {
            trmTrainAgencyDTO.setTrmtrainagencyname( entity.getTrmtrainagencyname() );
        }
        if ( entity.getLxr() != null ) {
            trmTrainAgencyDTO.setLxr( entity.getLxr() );
        }
        if ( entity.getJgbm() != null ) {
            trmTrainAgencyDTO.setJgbm( entity.getJgbm() );
        }
        if ( entity.getBz() != null ) {
            trmTrainAgencyDTO.setBz( entity.getBz() );
        }
        if ( entity.getWz() != null ) {
            trmTrainAgencyDTO.setWz( entity.getWz() );
        }
        if ( entity.getKplx() != null ) {
            trmTrainAgencyDTO.setKplx( entity.getKplx() );
        }
        if ( entity.getJglb() != null ) {
            trmTrainAgencyDTO.setJglb( entity.getJglb() );
        }
        if ( entity.getZcxx() != null ) {
            trmTrainAgencyDTO.setZcxx( entity.getZcxx() );
        }
        if ( entity.getKhhzh() != null ) {
            trmTrainAgencyDTO.setKhhzh( entity.getKhhzh() );
        }
        if ( entity.getPxzsc() != null ) {
            trmTrainAgencyDTO.setPxzsc( entity.getPxzsc() );
        }
        if ( entity.getKctxfw() != null ) {
            trmTrainAgencyDTO.setKctxfw( entity.getKctxfw() );
        }
        if ( entity.getKprdh() != null ) {
            trmTrainAgencyDTO.setKprdh( entity.getKprdh() );
        }
        if ( entity.getKpxx() != null ) {
            trmTrainAgencyDTO.setKpxx( entity.getKpxx() );
        }
        if ( entity.getDzxx() != null ) {
            trmTrainAgencyDTO.setDzxx( entity.getDzxx() );
        }
        if ( entity.getJj() != null ) {
            trmTrainAgencyDTO.setJj( entity.getJj() );
        }
        if ( entity.getPj() != null ) {
            trmTrainAgencyDTO.setPj( entity.getPj() );
        }
        if ( entity.getKpr() != null ) {
            trmTrainAgencyDTO.setKpr( entity.getKpr() );
        }
        if ( entity.getKpmc() != null ) {
            trmTrainAgencyDTO.setKpmc( entity.getKpmc() );
        }
        if ( entity.getKpdz() != null ) {
            trmTrainAgencyDTO.setKpdz( entity.getKpdz() );
        }
        if ( entity.getLxdh() != null ) {
            trmTrainAgencyDTO.setLxdh( entity.getLxdh() );
        }
        if ( entity.getPimpersonid() != null ) {
            trmTrainAgencyDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getOrmorgid() != null ) {
            trmTrainAgencyDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getTrmtrainagencyid2() != null ) {
            trmTrainAgencyDTO.setTrmtrainagencyid2( entity.getTrmtrainagencyid2() );
        }
        if ( entity.getCreateman() != null ) {
            trmTrainAgencyDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            trmTrainAgencyDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            trmTrainAgencyDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmTrainAgencyDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getEnable() != null ) {
            trmTrainAgencyDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getTrmtrainagencyid() != null ) {
            trmTrainAgencyDTO.setTrmtrainagencyid( entity.getTrmtrainagencyid() );
        }
        if ( entity.getTrmtrainagencyname2() != null ) {
            trmTrainAgencyDTO.setTrmtrainagencyname2( entity.getTrmtrainagencyname2() );
        }
        if ( entity.getZzdzs() != null ) {
            trmTrainAgencyDTO.setZzdzs( entity.getZzdzs() );
        }
        if ( entity.getOrmorgname() != null ) {
            trmTrainAgencyDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getPimpersonname() != null ) {
            trmTrainAgencyDTO.setPimpersonname( entity.getPimpersonname() );
        }

        return trmTrainAgencyDTO;
    }

    @Override
    public List<TrmTrainAgency> toDomain(List<TrmTrainAgencyDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmTrainAgency> list = new ArrayList<TrmTrainAgency>( dtoList.size() );
        for ( TrmTrainAgencyDTO trmTrainAgencyDTO : dtoList ) {
            list.add( toDomain( trmTrainAgencyDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmTrainAgencyDTO> toDto(List<TrmTrainAgency> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmTrainAgencyDTO> list = new ArrayList<TrmTrainAgencyDTO>( entityList.size() );
        for ( TrmTrainAgency trmTrainAgency : entityList ) {
            list.add( toDto( trmTrainAgency ) );
        }

        return list;
    }
}
