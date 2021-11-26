package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.orm.domain.OrmOrgsector;
import cn.ibizlab.ehr.webapi.dto.OrmOrgsectorDTO;
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
    date = "2021-09-04T00:31:52+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class OrmOrgsectorMappingImpl implements OrmOrgsectorMapping {

    @Override
    public OrmOrgsector toDomain(OrmOrgsectorDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrmOrgsector ormOrgsector = new OrmOrgsector();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            ormOrgsector.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            ormOrgsector.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getXmjbqk() != null ) {
            ormOrgsector.setXmjbqk( dto.getXmjbqk() );
        }
        if ( dto.getQy() != null ) {
            ormOrgsector.setQy( dto.getQy() );
        }
        if ( dto.getEdition() != null ) {
            ormOrgsector.setEdition( dto.getEdition() );
        }
        if ( dto.getSbsj() != null ) {
            ormOrgsector.setSbsj( dto.getSbsj() );
        }
        if ( dto.getXbsj() != null ) {
            ormOrgsector.setXbsj( dto.getXbsj() );
        }
        if ( dto.getStartstopsign() != null ) {
            ormOrgsector.setStartstopsign( dto.getStartstopsign() );
        }
        if ( dto.getBmbzrs() != null ) {
            ormOrgsector.setBmbzrs( dto.getBmbzrs() );
        }
        if ( dto.getBmsjbzrs() != null ) {
            ormOrgsector.setBmsjbzrs( dto.getBmsjbzrs() );
        }
        if ( dto.getGcmcjbm() != null ) {
            ormOrgsector.setGcmcjbm( dto.getGcmcjbm() );
        }
        if ( dto.getXmbq() != null ) {
            ormOrgsector.setXmbq( dto.getXmbq() );
        }
        if ( dto.getOldid() != null ) {
            ormOrgsector.setOldid( dto.getOldid() );
        }
        if ( dto.getKqkssj() != null ) {
            ormOrgsector.setKqkssj( dto.getKqkssj() );
        }
        if ( dto.getOrgcode() != null ) {
            ormOrgsector.setOrgcode( dto.getOrgcode() );
        }
        if ( dto.getJhry() != null ) {
            ormOrgsector.setJhry( dto.getJhry() );
        }
        if ( dto.getApprovalstatus() != null ) {
            ormOrgsector.setApprovalstatus( dto.getApprovalstatus() );
        }
        if ( dto.getKqjssj() != null ) {
            ormOrgsector.setKqjssj( dto.getKqjssj() );
        }
        if ( dto.getXmlx() != null ) {
            ormOrgsector.setXmlx( dto.getXmlx() );
        }
        if ( dto.getOrgtype() != null ) {
            ormOrgsector.setOrgtype( dto.getOrgtype() );
        }
        if ( dto.getErporgid() != null ) {
            ormOrgsector.setErporgid( dto.getErporgid() );
        }
        if ( dto.getDkfs() != null ) {
            ormOrgsector.setDkfs( dto.getDkfs() );
        }
        if ( dto.getXmlxqt() != null ) {
            ormOrgsector.setXmlxqt( dto.getXmlxqt() );
        }
        if ( dto.getSjrs() != null ) {
            ormOrgsector.setSjrs( dto.getSjrs() );
        }
        if ( dto.getZwsl() != null ) {
            ormOrgsector.setZwsl( dto.getZwsl() );
        }
        if ( dto.getShgwsl() != null ) {
            ormOrgsector.setShgwsl( dto.getShgwsl() );
        }
        if ( dto.getXmgm() != null ) {
            ormOrgsector.setXmgm( dto.getXmgm() );
        }
        if ( dto.getGwsl() != null ) {
            ormOrgsector.setGwsl( dto.getGwsl() );
        }
        if ( dto.getDxmjlyq() != null ) {
            ormOrgsector.setDxmjlyq( dto.getDxmjlyq() );
        }
        if ( dto.getDxmzgyq() != null ) {
            ormOrgsector.setDxmzgyq( dto.getDxmzgyq() );
        }
        if ( dto.getTitle() != null ) {
            ormOrgsector.setTitle( dto.getTitle() );
        }
        if ( dto.getValidflag() != null ) {
            ormOrgsector.setValidflag( dto.getValidflag() );
        }
        if ( dto.getReferjoblevel() != null ) {
            ormOrgsector.setReferjoblevel( dto.getReferjoblevel() );
        }
        if ( dto.getBelongou() != null ) {
            ormOrgsector.setBelongou( dto.getBelongou() );
        }
        if ( dto.getShzwsl() != null ) {
            ormOrgsector.setShzwsl( dto.getShzwsl() );
        }
        if ( dto.getShortname() != null ) {
            ormOrgsector.setShortname( dto.getShortname() );
        }
        if ( dto.getGqap() != null ) {
            ormOrgsector.setGqap( dto.getGqap() );
        }
        if ( dto.getJhcb() != null ) {
            ormOrgsector.setJhcb( dto.getJhcb() );
        }
        if ( dto.getBmlx() != null ) {
            ormOrgsector.setBmlx( dto.getBmlx() );
        }
        if ( dto.getXmblx() != null ) {
            ormOrgsector.setXmblx( dto.getXmblx() );
        }
        if ( dto.getGkjz() != null ) {
            ormOrgsector.setGkjz( dto.getGkjz() );
        }
        if ( dto.getEditionstate() != null ) {
            ormOrgsector.setEditionstate( dto.getEditionstate() );
        }
        if ( dto.getSjcb() != null ) {
            ormOrgsector.setSjcb( dto.getSjcb() );
        }
        if ( dto.getSjry() != null ) {
            ormOrgsector.setSjry( dto.getSjry() );
        }
        if ( dto.getBelongregion() != null ) {
            ormOrgsector.setBelongregion( dto.getBelongregion() );
        }
        if ( dto.getPimpersonid() != null ) {
            ormOrgsector.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getOrmxmglid() != null ) {
            ormOrgsector.setOrmxmglid( dto.getOrmxmglid() );
        }
        if ( dto.getProdepid() != null ) {
            ormOrgsector.setProdepid( dto.getProdepid() );
        }
        if ( dto.getProleaderid() != null ) {
            ormOrgsector.setProleaderid( dto.getProleaderid() );
        }
        if ( dto.getPorgsectorid() != null ) {
            ormOrgsector.setPorgsectorid( dto.getPorgsectorid() );
        }
        if ( dto.getUpdateman() != null ) {
            ormOrgsector.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrdervalue() != null ) {
            ormOrgsector.setOrdervalue( dto.getOrdervalue() );
        }
        if ( dto.getCreatedate() != null ) {
            ormOrgsector.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getGwbzsl() != null ) {
            ormOrgsector.setGwbzsl( dto.getGwbzsl() );
        }
        if ( dto.getSjbzrsColor() != null ) {
            ormOrgsector.setSjbzrsColor( dto.getSjbzrsColor() );
        }
        if ( dto.getXccb() != null ) {
            ormOrgsector.setXccb( dto.getXccb() );
        }
        if ( dto.getUpdatedate() != null ) {
            ormOrgsector.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getZwbzsl() != null ) {
            ormOrgsector.setZwbzsl( dto.getZwbzsl() );
        }
        if ( dto.getOrgsectorname() != null ) {
            ormOrgsector.setOrgsectorname( dto.getOrgsectorname() );
        }
        if ( dto.getXcry() != null ) {
            ormOrgsector.setXcry( dto.getXcry() );
        }
        if ( dto.getSjbzrs() != null ) {
            ormOrgsector.setSjbzrs( dto.getSjbzrs() );
        }
        if ( dto.getOrgsectorid() != null ) {
            ormOrgsector.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getCreateman() != null ) {
            ormOrgsector.setCreateman( dto.getCreateman() );
        }
        if ( dto.getEngineeringscale() != null ) {
            ormOrgsector.setEngineeringscale( dto.getEngineeringscale() );
        }
        if ( dto.getProleadername() != null ) {
            ormOrgsector.setProleadername( dto.getProleadername() );
        }
        if ( dto.getProdepname() != null ) {
            ormOrgsector.setProdepname( dto.getProdepname() );
        }
        if ( dto.getOrmxmglname() != null ) {
            ormOrgsector.setOrmxmglname( dto.getOrmxmglname() );
        }
        if ( dto.getPimpersonname() != null ) {
            ormOrgsector.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getOrgname() != null ) {
            ormOrgsector.setOrgname( dto.getOrgname() );
        }
        if ( dto.getZzdzs() != null ) {
            ormOrgsector.setZzdzs( dto.getZzdzs() );
        }
        if ( dto.getXmbh() != null ) {
            ormOrgsector.setXmbh( dto.getXmbh() );
        }
        if ( dto.getPorgsectorname() != null ) {
            ormOrgsector.setPorgsectorname( dto.getPorgsectorname() );
        }
        if ( dto.getOrgid() != null ) {
            ormOrgsector.setOrgid( dto.getOrgid() );
        }

        return ormOrgsector;
    }

    @Override
    public OrmOrgsectorDTO toDto(OrmOrgsector entity) {
        if ( entity == null ) {
            return null;
        }

        OrmOrgsectorDTO ormOrgsectorDTO = new OrmOrgsectorDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            ormOrgsectorDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            ormOrgsectorDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getXmjbqk() != null ) {
            ormOrgsectorDTO.setXmjbqk( entity.getXmjbqk() );
        }
        if ( entity.getQy() != null ) {
            ormOrgsectorDTO.setQy( entity.getQy() );
        }
        if ( entity.getEdition() != null ) {
            ormOrgsectorDTO.setEdition( entity.getEdition() );
        }
        if ( entity.getSbsj() != null ) {
            ormOrgsectorDTO.setSbsj( entity.getSbsj() );
        }
        if ( entity.getXbsj() != null ) {
            ormOrgsectorDTO.setXbsj( entity.getXbsj() );
        }
        if ( entity.getStartstopsign() != null ) {
            ormOrgsectorDTO.setStartstopsign( entity.getStartstopsign() );
        }
        if ( entity.getBmbzrs() != null ) {
            ormOrgsectorDTO.setBmbzrs( entity.getBmbzrs() );
        }
        if ( entity.getBmsjbzrs() != null ) {
            ormOrgsectorDTO.setBmsjbzrs( entity.getBmsjbzrs() );
        }
        if ( entity.getGcmcjbm() != null ) {
            ormOrgsectorDTO.setGcmcjbm( entity.getGcmcjbm() );
        }
        if ( entity.getXmbq() != null ) {
            ormOrgsectorDTO.setXmbq( entity.getXmbq() );
        }
        if ( entity.getOldid() != null ) {
            ormOrgsectorDTO.setOldid( entity.getOldid() );
        }
        if ( entity.getKqkssj() != null ) {
            ormOrgsectorDTO.setKqkssj( entity.getKqkssj() );
        }
        if ( entity.getOrgcode() != null ) {
            ormOrgsectorDTO.setOrgcode( entity.getOrgcode() );
        }
        if ( entity.getJhry() != null ) {
            ormOrgsectorDTO.setJhry( entity.getJhry() );
        }
        if ( entity.getApprovalstatus() != null ) {
            ormOrgsectorDTO.setApprovalstatus( entity.getApprovalstatus() );
        }
        if ( entity.getKqjssj() != null ) {
            ormOrgsectorDTO.setKqjssj( entity.getKqjssj() );
        }
        if ( entity.getXmlx() != null ) {
            ormOrgsectorDTO.setXmlx( entity.getXmlx() );
        }
        if ( entity.getOrgtype() != null ) {
            ormOrgsectorDTO.setOrgtype( entity.getOrgtype() );
        }
        if ( entity.getErporgid() != null ) {
            ormOrgsectorDTO.setErporgid( entity.getErporgid() );
        }
        if ( entity.getDkfs() != null ) {
            ormOrgsectorDTO.setDkfs( entity.getDkfs() );
        }
        if ( entity.getXmlxqt() != null ) {
            ormOrgsectorDTO.setXmlxqt( entity.getXmlxqt() );
        }
        if ( entity.getSjrs() != null ) {
            ormOrgsectorDTO.setSjrs( entity.getSjrs() );
        }
        if ( entity.getZwsl() != null ) {
            ormOrgsectorDTO.setZwsl( entity.getZwsl() );
        }
        if ( entity.getShgwsl() != null ) {
            ormOrgsectorDTO.setShgwsl( entity.getShgwsl() );
        }
        if ( entity.getXmgm() != null ) {
            ormOrgsectorDTO.setXmgm( entity.getXmgm() );
        }
        if ( entity.getGwsl() != null ) {
            ormOrgsectorDTO.setGwsl( entity.getGwsl() );
        }
        if ( entity.getDxmjlyq() != null ) {
            ormOrgsectorDTO.setDxmjlyq( entity.getDxmjlyq() );
        }
        if ( entity.getDxmzgyq() != null ) {
            ormOrgsectorDTO.setDxmzgyq( entity.getDxmzgyq() );
        }
        if ( entity.getTitle() != null ) {
            ormOrgsectorDTO.setTitle( entity.getTitle() );
        }
        if ( entity.getValidflag() != null ) {
            ormOrgsectorDTO.setValidflag( entity.getValidflag() );
        }
        if ( entity.getReferjoblevel() != null ) {
            ormOrgsectorDTO.setReferjoblevel( entity.getReferjoblevel() );
        }
        if ( entity.getBelongou() != null ) {
            ormOrgsectorDTO.setBelongou( entity.getBelongou() );
        }
        if ( entity.getShzwsl() != null ) {
            ormOrgsectorDTO.setShzwsl( entity.getShzwsl() );
        }
        if ( entity.getShortname() != null ) {
            ormOrgsectorDTO.setShortname( entity.getShortname() );
        }
        if ( entity.getGqap() != null ) {
            ormOrgsectorDTO.setGqap( entity.getGqap() );
        }
        if ( entity.getJhcb() != null ) {
            ormOrgsectorDTO.setJhcb( entity.getJhcb() );
        }
        if ( entity.getBmlx() != null ) {
            ormOrgsectorDTO.setBmlx( entity.getBmlx() );
        }
        if ( entity.getXmblx() != null ) {
            ormOrgsectorDTO.setXmblx( entity.getXmblx() );
        }
        if ( entity.getGkjz() != null ) {
            ormOrgsectorDTO.setGkjz( entity.getGkjz() );
        }
        if ( entity.getEditionstate() != null ) {
            ormOrgsectorDTO.setEditionstate( entity.getEditionstate() );
        }
        if ( entity.getSjcb() != null ) {
            ormOrgsectorDTO.setSjcb( entity.getSjcb() );
        }
        if ( entity.getSjry() != null ) {
            ormOrgsectorDTO.setSjry( entity.getSjry() );
        }
        if ( entity.getBelongregion() != null ) {
            ormOrgsectorDTO.setBelongregion( entity.getBelongregion() );
        }
        if ( entity.getPimpersonid() != null ) {
            ormOrgsectorDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getOrmxmglid() != null ) {
            ormOrgsectorDTO.setOrmxmglid( entity.getOrmxmglid() );
        }
        if ( entity.getProdepid() != null ) {
            ormOrgsectorDTO.setProdepid( entity.getProdepid() );
        }
        if ( entity.getProleaderid() != null ) {
            ormOrgsectorDTO.setProleaderid( entity.getProleaderid() );
        }
        if ( entity.getPorgsectorid() != null ) {
            ormOrgsectorDTO.setPorgsectorid( entity.getPorgsectorid() );
        }
        if ( entity.getUpdateman() != null ) {
            ormOrgsectorDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrdervalue() != null ) {
            ormOrgsectorDTO.setOrdervalue( entity.getOrdervalue() );
        }
        if ( entity.getCreatedate() != null ) {
            ormOrgsectorDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getGwbzsl() != null ) {
            ormOrgsectorDTO.setGwbzsl( entity.getGwbzsl() );
        }
        if ( entity.getSjbzrsColor() != null ) {
            ormOrgsectorDTO.setSjbzrsColor( entity.getSjbzrsColor() );
        }
        if ( entity.getXccb() != null ) {
            ormOrgsectorDTO.setXccb( entity.getXccb() );
        }
        if ( entity.getUpdatedate() != null ) {
            ormOrgsectorDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getZwbzsl() != null ) {
            ormOrgsectorDTO.setZwbzsl( entity.getZwbzsl() );
        }
        if ( entity.getOrgsectorname() != null ) {
            ormOrgsectorDTO.setOrgsectorname( entity.getOrgsectorname() );
        }
        if ( entity.getXcry() != null ) {
            ormOrgsectorDTO.setXcry( entity.getXcry() );
        }
        if ( entity.getSjbzrs() != null ) {
            ormOrgsectorDTO.setSjbzrs( entity.getSjbzrs() );
        }
        if ( entity.getOrgsectorid() != null ) {
            ormOrgsectorDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getCreateman() != null ) {
            ormOrgsectorDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getEngineeringscale() != null ) {
            ormOrgsectorDTO.setEngineeringscale( entity.getEngineeringscale() );
        }
        if ( entity.getProleadername() != null ) {
            ormOrgsectorDTO.setProleadername( entity.getProleadername() );
        }
        if ( entity.getProdepname() != null ) {
            ormOrgsectorDTO.setProdepname( entity.getProdepname() );
        }
        if ( entity.getOrmxmglname() != null ) {
            ormOrgsectorDTO.setOrmxmglname( entity.getOrmxmglname() );
        }
        if ( entity.getPimpersonname() != null ) {
            ormOrgsectorDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getOrgname() != null ) {
            ormOrgsectorDTO.setOrgname( entity.getOrgname() );
        }
        if ( entity.getZzdzs() != null ) {
            ormOrgsectorDTO.setZzdzs( entity.getZzdzs() );
        }
        if ( entity.getXmbh() != null ) {
            ormOrgsectorDTO.setXmbh( entity.getXmbh() );
        }
        if ( entity.getPorgsectorname() != null ) {
            ormOrgsectorDTO.setPorgsectorname( entity.getPorgsectorname() );
        }
        if ( entity.getOrgid() != null ) {
            ormOrgsectorDTO.setOrgid( entity.getOrgid() );
        }

        return ormOrgsectorDTO;
    }

    @Override
    public List<OrmOrgsector> toDomain(List<OrmOrgsectorDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OrmOrgsector> list = new ArrayList<OrmOrgsector>( dtoList.size() );
        for ( OrmOrgsectorDTO ormOrgsectorDTO : dtoList ) {
            list.add( toDomain( ormOrgsectorDTO ) );
        }

        return list;
    }

    @Override
    public List<OrmOrgsectorDTO> toDto(List<OrmOrgsector> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrmOrgsectorDTO> list = new ArrayList<OrmOrgsectorDTO>( entityList.size() );
        for ( OrmOrgsector ormOrgsector : entityList ) {
            list.add( toDto( ormOrgsector ) );
        }

        return list;
    }
}
