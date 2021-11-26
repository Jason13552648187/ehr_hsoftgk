package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.orm.domain.OrmXmrypzxq;
import cn.ibizlab.ehr.webapi.dto.OrmXmrypzxqDTO;
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
public class OrmXmrypzxqMappingImpl implements OrmXmrypzxqMapping {

    @Override
    public OrmXmrypzxq toDomain(OrmXmrypzxqDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrmXmrypzxq ormXmrypzxq = new OrmXmrypzxq();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            ormXmrypzxq.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            ormXmrypzxq.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getApprovalstatus() != null ) {
            ormXmrypzxq.setApprovalstatus( dto.getApprovalstatus() );
        }
        if ( dto.getGw() != null ) {
            ormXmrypzxq.setGw( dto.getGw() );
        }
        if ( dto.getPlanstate() != null ) {
            ormXmrypzxq.setPlanstate( dto.getPlanstate() );
        }
        if ( dto.getModspzt() != null ) {
            ormXmrypzxq.setModspzt( dto.getModspzt() );
        }
        if ( dto.getMajorresp() != null ) {
            ormXmrypzxq.setMajorresp( dto.getMajorresp() );
        }
        if ( dto.getTpjjyy() != null ) {
            ormXmrypzxq.setTpjjyy( dto.getTpjjyy() );
        }
        if ( dto.getXh() != null ) {
            ormXmrypzxq.setXh( dto.getXh() );
        }
        if ( dto.getContresultone() != null ) {
            ormXmrypzxq.setContresultone( dto.getContresultone() );
        }
        if ( dto.getSpzt() != null ) {
            ormXmrypzxq.setSpzt( dto.getSpzt() );
        }
        if ( dto.getSfjjyy() != null ) {
            ormXmrypzxq.setSfjjyy( dto.getSfjjyy() );
        }
        if ( dto.getOrmxmrypzxqname() != null ) {
            ormXmrypzxq.setOrmxmrypzxqname( dto.getOrmxmrypzxqname() );
        }
        if ( dto.getKqjssj() != null ) {
            ormXmrypzxq.setKqjssj( dto.getKqjssj() );
        }
        if ( dto.getKqkssj() != null ) {
            ormXmrypzxq.setKqkssj( dto.getKqkssj() );
        }
        if ( dto.getRealarrivaltime() != null ) {
            ormXmrypzxq.setRealarrivaltime( dto.getRealarrivaltime() );
        }
        if ( dto.getIstemp() != null ) {
            ormXmrypzxq.setIstemp( dto.getIstemp() );
        }
        if ( dto.getRealleavetime() != null ) {
            ormXmrypzxq.setRealleavetime( dto.getRealleavetime() );
        }
        if ( dto.getReason() != null ) {
            ormXmrypzxq.setReason( dto.getReason() );
        }
        if ( dto.getTpspzt() != null ) {
            ormXmrypzxq.setTpspzt( dto.getTpspzt() );
        }
        if ( dto.getContresulttwo() != null ) {
            ormXmrypzxq.setContresulttwo( dto.getContresulttwo() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            ormXmrypzxq.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getOrmxmxqjhid() != null ) {
            ormXmrypzxq.setOrmxmxqjhid( dto.getOrmxmxqjhid() );
        }
        if ( dto.getRealpersonid() != null ) {
            ormXmrypzxq.setRealpersonid( dto.getRealpersonid() );
        }
        if ( dto.getPimpersonid() != null ) {
            ormXmrypzxq.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getModpimpersonid() != null ) {
            ormXmrypzxq.setModpimpersonid( dto.getModpimpersonid() );
        }
        if ( dto.getOrmpostid() != null ) {
            ormXmrypzxq.setOrmpostid( dto.getOrmpostid() );
        }
        if ( dto.getOrmxmrypzxqid() != null ) {
            ormXmrypzxq.setOrmxmrypzxqid( dto.getOrmxmrypzxqid() );
        }
        if ( dto.getUpdateman() != null ) {
            ormXmrypzxq.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            ormXmrypzxq.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            ormXmrypzxq.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            ormXmrypzxq.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrgid() != null ) {
            ormXmrypzxq.setOrgid( dto.getOrgid() );
        }
        if ( dto.getModpersonname() != null ) {
            ormXmrypzxq.setModpersonname( dto.getModpersonname() );
        }
        if ( dto.getOrmpostname() != null ) {
            ormXmrypzxq.setOrmpostname( dto.getOrmpostname() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            ormXmrypzxq.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }
        if ( dto.getIskeypostion() != null ) {
            ormXmrypzxq.setIskeypostion( dto.getIskeypostion() );
        }
        if ( dto.getOrgshortname() != null ) {
            ormXmrypzxq.setOrgshortname( dto.getOrgshortname() );
        }
        if ( dto.getCertificateability() != null ) {
            ormXmrypzxq.setCertificateability( dto.getCertificateability() );
        }
        if ( dto.getAge() != null ) {
            ormXmrypzxq.setAge( dto.getAge() );
        }
        if ( dto.getSex() != null ) {
            ormXmrypzxq.setSex( dto.getSex() );
        }
        if ( dto.getCurpost() != null ) {
            ormXmrypzxq.setCurpost( dto.getCurpost() );
        }
        if ( dto.getRealpersonname() != null ) {
            ormXmrypzxq.setRealpersonname( dto.getRealpersonname() );
        }
        if ( dto.getGcmcjbm() != null ) {
            ormXmrypzxq.setGcmcjbm( dto.getGcmcjbm() );
        }
        if ( dto.getOrginfoid() != null ) {
            ormXmrypzxq.setOrginfoid( dto.getOrginfoid() );
        }
        if ( dto.getPersonnum() != null ) {
            ormXmrypzxq.setPersonnum( dto.getPersonnum() );
        }
        if ( dto.getXmmc() != null ) {
            ormXmrypzxq.setXmmc( dto.getXmmc() );
        }
        if ( dto.getXmbmc() != null ) {
            ormXmrypzxq.setXmbmc( dto.getXmbmc() );
        }
        if ( dto.getPimpersonname() != null ) {
            ormXmrypzxq.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getOrgsecinfoid() != null ) {
            ormXmrypzxq.setOrgsecinfoid( dto.getOrgsecinfoid() );
        }

        return ormXmrypzxq;
    }

    @Override
    public OrmXmrypzxqDTO toDto(OrmXmrypzxq entity) {
        if ( entity == null ) {
            return null;
        }

        OrmXmrypzxqDTO ormXmrypzxqDTO = new OrmXmrypzxqDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            ormXmrypzxqDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            ormXmrypzxqDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getApprovalstatus() != null ) {
            ormXmrypzxqDTO.setApprovalstatus( entity.getApprovalstatus() );
        }
        if ( entity.getGw() != null ) {
            ormXmrypzxqDTO.setGw( entity.getGw() );
        }
        if ( entity.getPlanstate() != null ) {
            ormXmrypzxqDTO.setPlanstate( entity.getPlanstate() );
        }
        if ( entity.getModspzt() != null ) {
            ormXmrypzxqDTO.setModspzt( entity.getModspzt() );
        }
        if ( entity.getMajorresp() != null ) {
            ormXmrypzxqDTO.setMajorresp( entity.getMajorresp() );
        }
        if ( entity.getTpjjyy() != null ) {
            ormXmrypzxqDTO.setTpjjyy( entity.getTpjjyy() );
        }
        if ( entity.getXh() != null ) {
            ormXmrypzxqDTO.setXh( entity.getXh() );
        }
        if ( entity.getContresultone() != null ) {
            ormXmrypzxqDTO.setContresultone( entity.getContresultone() );
        }
        if ( entity.getSpzt() != null ) {
            ormXmrypzxqDTO.setSpzt( entity.getSpzt() );
        }
        if ( entity.getSfjjyy() != null ) {
            ormXmrypzxqDTO.setSfjjyy( entity.getSfjjyy() );
        }
        if ( entity.getOrmxmrypzxqname() != null ) {
            ormXmrypzxqDTO.setOrmxmrypzxqname( entity.getOrmxmrypzxqname() );
        }
        if ( entity.getKqjssj() != null ) {
            ormXmrypzxqDTO.setKqjssj( entity.getKqjssj() );
        }
        if ( entity.getKqkssj() != null ) {
            ormXmrypzxqDTO.setKqkssj( entity.getKqkssj() );
        }
        if ( entity.getRealarrivaltime() != null ) {
            ormXmrypzxqDTO.setRealarrivaltime( entity.getRealarrivaltime() );
        }
        if ( entity.getIstemp() != null ) {
            ormXmrypzxqDTO.setIstemp( entity.getIstemp() );
        }
        if ( entity.getRealleavetime() != null ) {
            ormXmrypzxqDTO.setRealleavetime( entity.getRealleavetime() );
        }
        if ( entity.getReason() != null ) {
            ormXmrypzxqDTO.setReason( entity.getReason() );
        }
        if ( entity.getTpspzt() != null ) {
            ormXmrypzxqDTO.setTpspzt( entity.getTpspzt() );
        }
        if ( entity.getContresulttwo() != null ) {
            ormXmrypzxqDTO.setContresulttwo( entity.getContresulttwo() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            ormXmrypzxqDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getOrmxmxqjhid() != null ) {
            ormXmrypzxqDTO.setOrmxmxqjhid( entity.getOrmxmxqjhid() );
        }
        if ( entity.getRealpersonid() != null ) {
            ormXmrypzxqDTO.setRealpersonid( entity.getRealpersonid() );
        }
        if ( entity.getPimpersonid() != null ) {
            ormXmrypzxqDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getModpimpersonid() != null ) {
            ormXmrypzxqDTO.setModpimpersonid( entity.getModpimpersonid() );
        }
        if ( entity.getOrmpostid() != null ) {
            ormXmrypzxqDTO.setOrmpostid( entity.getOrmpostid() );
        }
        if ( entity.getOrmxmrypzxqid() != null ) {
            ormXmrypzxqDTO.setOrmxmrypzxqid( entity.getOrmxmrypzxqid() );
        }
        if ( entity.getUpdateman() != null ) {
            ormXmrypzxqDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            ormXmrypzxqDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            ormXmrypzxqDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            ormXmrypzxqDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrgid() != null ) {
            ormXmrypzxqDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getModpersonname() != null ) {
            ormXmrypzxqDTO.setModpersonname( entity.getModpersonname() );
        }
        if ( entity.getOrmpostname() != null ) {
            ormXmrypzxqDTO.setOrmpostname( entity.getOrmpostname() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            ormXmrypzxqDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }
        if ( entity.getIskeypostion() != null ) {
            ormXmrypzxqDTO.setIskeypostion( entity.getIskeypostion() );
        }
        if ( entity.getOrgshortname() != null ) {
            ormXmrypzxqDTO.setOrgshortname( entity.getOrgshortname() );
        }
        if ( entity.getCertificateability() != null ) {
            ormXmrypzxqDTO.setCertificateability( entity.getCertificateability() );
        }
        if ( entity.getAge() != null ) {
            ormXmrypzxqDTO.setAge( entity.getAge() );
        }
        if ( entity.getSex() != null ) {
            ormXmrypzxqDTO.setSex( entity.getSex() );
        }
        if ( entity.getCurpost() != null ) {
            ormXmrypzxqDTO.setCurpost( entity.getCurpost() );
        }
        if ( entity.getRealpersonname() != null ) {
            ormXmrypzxqDTO.setRealpersonname( entity.getRealpersonname() );
        }
        if ( entity.getGcmcjbm() != null ) {
            ormXmrypzxqDTO.setGcmcjbm( entity.getGcmcjbm() );
        }
        if ( entity.getOrginfoid() != null ) {
            ormXmrypzxqDTO.setOrginfoid( entity.getOrginfoid() );
        }
        if ( entity.getPersonnum() != null ) {
            ormXmrypzxqDTO.setPersonnum( entity.getPersonnum() );
        }
        if ( entity.getXmmc() != null ) {
            ormXmrypzxqDTO.setXmmc( entity.getXmmc() );
        }
        if ( entity.getXmbmc() != null ) {
            ormXmrypzxqDTO.setXmbmc( entity.getXmbmc() );
        }
        if ( entity.getPimpersonname() != null ) {
            ormXmrypzxqDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getOrgsecinfoid() != null ) {
            ormXmrypzxqDTO.setOrgsecinfoid( entity.getOrgsecinfoid() );
        }

        return ormXmrypzxqDTO;
    }

    @Override
    public List<OrmXmrypzxq> toDomain(List<OrmXmrypzxqDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OrmXmrypzxq> list = new ArrayList<OrmXmrypzxq>( dtoList.size() );
        for ( OrmXmrypzxqDTO ormXmrypzxqDTO : dtoList ) {
            list.add( toDomain( ormXmrypzxqDTO ) );
        }

        return list;
    }

    @Override
    public List<OrmXmrypzxqDTO> toDto(List<OrmXmrypzxq> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrmXmrypzxqDTO> list = new ArrayList<OrmXmrypzxqDTO>( entityList.size() );
        for ( OrmXmrypzxq ormXmrypzxq : entityList ) {
            list.add( toDto( ormXmrypzxq ) );
        }

        return list;
    }
}
